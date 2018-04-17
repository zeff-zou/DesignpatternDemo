package com.designpattern.adapter.classAdapter;

/**
 * Created by zzf on 2018/4/16.
 */
public class Adapter extends BeAdapted implements AdapterInterface {
    @Override
    public void method2() {
        System.out.println("Adapter:method2");
    }
}
