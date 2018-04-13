package com.designpattern.observer.integrated;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zzf on 2018/4/12.
 * 观察者
 */
public class Reader implements Observer {
    //读者名称
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //读者关注某一位作者
    public void subscribe(String writerName){
        WriterManager.getInstance().getWriter(writerName).addObserver(this);
    }

    //读者取消关注某一位作者
    public void unsubscribe(String writerName){
        WriterManager.getInstance().getWriter(writerName).deleteObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Writer) {
            Writer writer = (Writer) o;
            System.out.println(name+"知道了" + writer.getName() + "发布了新书《" + writer.getLastNovel() + "》");
        }
    }
}
