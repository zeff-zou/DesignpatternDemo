package com.designpattern.composite;

/**
 * Created by zzf on 2018/4/20.
 */
public interface IFile {
    void delete();
    String getName();
    //创建新文件，相当于add方法
    void createNewFile(String name);
    //相当于remove方法
    void deleteFile(String name);
    //相当于GetChild方法
    IFile getIFile(int index);
    //返回当前文件夹下的子文件夹数量
    Integer getSubFileNumber();
}
