package com.designpattern.singleton;

/**
 * Created by zzf on 2018/4/9.
 * 饿汉式
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    public void sayHi(){
        System.out.println("HungrySingleton: "+hungrySingleton.toString());
    }
}
