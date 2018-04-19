package com.designpattern.bridge;

/**
 * Created by zzf on 2018/4/19.
 */
public class White implements Colour {
    @Override
    public void bepaint(String shape) {
        System.out.println("白色的"+shape);
    }
}
