package com.designpattern.observer.simple;

/**
 * Created by zzf on 2018/4/12.
 */
public class Observer1 implements Observer {
    @Override
    public void update(Observable o) {
        System.out.println("观察者1观察到" + o.getClass().getSimpleName() + "发生了变化");
    }
}
