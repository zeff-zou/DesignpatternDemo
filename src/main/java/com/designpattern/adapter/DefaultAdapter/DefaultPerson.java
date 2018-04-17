package com.designpattern.adapter.DefaultAdapter;

/**
 * Created by zzf on 2018/4/17.
 */
public class DefaultPerson implements Person{
    @Override
    public void speak() {
        System.out.println("DefaultPerson:speak");
    }

    @Override
    public void listen() {
        System.out.println("DefaultPerson:listen");
    }

    @Override
    public void work() {
        System.out.println("DefaultPerson:work");
    }
}
