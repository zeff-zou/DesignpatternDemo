package com.designpattern.proxy;

/**
 * Created by zzf on 2018/4/10.
 */
public class BussinessImpl implements Bussiness {

    @Override
    public void execute() {
        System.out.println("执行的业务代码");
    }
}
