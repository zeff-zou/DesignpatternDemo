package com.designpattern.decorator;

/**
 * Created by zzf on 2018/4/17.
 */
public class ConcreteCafe implements Coffee{

    @Override
    public void getCoffee() {
        System.out.println("获得咖啡");
    }

}
