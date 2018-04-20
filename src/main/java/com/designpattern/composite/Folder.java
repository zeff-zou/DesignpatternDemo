package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzf on 2018/4/20.
 */
public class Folder implements IFile{
    private String name;
    private IFile folder;
    private List<IFile> files;

    public Folder(String name) {
        this(name, null);
    }

    public Folder(String name,IFile folder) {
        super();
        this.name = name;
        this.folder = folder;
        files = new ArrayList<IFile>();
    }
    @Override
    public void delete() {
        List<IFile> copy = new ArrayList<IFile>(files);
        System.out.println("------------删除子文件-------------");
        for (IFile file : copy) {
            file.delete();
        }
        System.out.println("----------删除子文件结束-------------");
        if (folder != null) {
            folder.deleteFile(name);
        }
        System.out.println("---删除[" + name + "]---");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void createNewFile(String name) {
        files.add(new Folder(name,this));
    }

    @Override
    public void deleteFile(String name) {
        for (IFile file : files) {
            if (file.getName().equals(name)) {
                files.remove(file);
                break;
            }
        }
    }

    @Override
    public IFile getIFile(int index) {
        return files.get(index);
    }

    @Override
    public Integer getSubFileNumber() {
        return files.size();
    }
}
