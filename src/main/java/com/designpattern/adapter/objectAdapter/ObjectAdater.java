package com.designpattern.adapter.objectAdapter;

/**
 * Created by zzf on 2018/4/16.
 */
public class ObjectAdater extends AdapterOne {

    private static AdapterTwo adapted = new AdapterTwo();

    public void method3(){
        adapted.method3();
    }
}
