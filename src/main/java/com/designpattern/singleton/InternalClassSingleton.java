package com.designpattern.singleton;

/**
 * Created by zzf on 2018/4/9.
 */
public class InternalClassSingleton {

    private  InternalClassSingleton(){}

    private static class SingletonHelp  {
        static InternalClassSingleton internalClassSingleton = new InternalClassSingleton();
    }

    public static InternalClassSingleton getInstance() {
        return SingletonHelp.internalClassSingleton;
    }

    public void sayHi(){
        System.out.println("LazySingleton: "+SingletonHelp.internalClassSingleton.toString());
    }
}
