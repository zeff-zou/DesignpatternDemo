package com.designpattern.singleton;

/**
 * Created by zzf on 2018/4/9.
 */
public class LazySingleton {

    private LazySingleton(){}

    public static LazySingleton lazySingleton = null;

    public static LazySingleton getInstance() {
        //多个线程判断lazySingleton都为null时，在执行new操作时多线程会出现重复情况
        if (lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public void sayHi(){
        System.out.println("LazySingleton: "+lazySingleton.toString());
    }
}
