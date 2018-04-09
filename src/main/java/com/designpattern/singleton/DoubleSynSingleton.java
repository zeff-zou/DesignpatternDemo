package com.designpattern.singleton;

/**
 * Created by zzf on 2018/4/9.
 */
public class DoubleSynSingleton {

    private static DoubleSynSingleton doubleSynSingleton;

    private DoubleSynSingleton(){}

    public  static DoubleSynSingleton getInstance(){
        if (doubleSynSingleton == null) {
            synchronized(DoubleSynSingleton.class) {
                if (doubleSynSingleton == null){
                    doubleSynSingleton = new DoubleSynSingleton();
                }
            }
        }
        return doubleSynSingleton;
    }

    public void sayHi(){
        System.out.println("SynchronizedSingleton: "+doubleSynSingleton.toString());
    }
}
