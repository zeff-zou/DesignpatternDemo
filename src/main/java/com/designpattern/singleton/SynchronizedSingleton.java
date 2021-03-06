package com.designpattern.singleton;

/**
 * Created by zzf on 2018/4/9.
 */
public class SynchronizedSingleton {
    //一个静态的实例
    private static SynchronizedSingleton synchronizedSingleton;
    //私有化构造函数
    private SynchronizedSingleton(){}
    //给出一个公共的静态方法返回一个单一实例
    public synchronized static SynchronizedSingleton getInstance(){
        if (synchronizedSingleton == null) {
            synchronizedSingleton = new SynchronizedSingleton();
        }
        return synchronizedSingleton;
    }

    public void sayHi(){
        System.out.println("SynchronizedSingleton: "+synchronizedSingleton.toString());
    }
}
