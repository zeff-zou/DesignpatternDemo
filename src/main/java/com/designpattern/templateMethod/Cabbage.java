package com.designpattern.templateMethod;

/**
 * Created by zzf on 2018/4/17.
 */
public class Cabbage extends Cook {
    @Override
    void putVegetable() {
        System.out.println("放了卷心菜");
    }

    @Override
    void putSauce() {
        System.out.println("放了味精");
    }
}
