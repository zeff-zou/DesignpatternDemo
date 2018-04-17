package com.designpattern.templateMethod;

/**
 * Created by zzf on 2018/4/17.
 */
public class Tomato extends Cook {
    @Override
    void putVegetable() {
        System.out.println("放了西红柿");
    }

    @Override
    void putSauce() {
        System.out.println("放了盐");
    }
}
