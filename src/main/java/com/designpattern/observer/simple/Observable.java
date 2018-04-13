package com.designpattern.observer.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzf on 2018/4/12.
 * 被观察者
 */
public class Observable {

    List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void changed(){
        System.out.println("我是被观察者，我已经发生变化了");
        notifyObservers();//通知观察自己的所有观察者
    }

    private void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
