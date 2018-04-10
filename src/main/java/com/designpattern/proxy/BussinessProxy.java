package com.designpattern.proxy;

/**
 * Created by zzf on 2018/4/10.
 * 静态代理类
 */
public class BussinessProxy implements Bussiness{

    private Bussiness bussinessImpl;

    public void setBussinessImpl(Bussiness bussinessImpl) {
        this.bussinessImpl = bussinessImpl;
    }

    @Override
    public void execute() {
        System.out.println("前拦截");
        bussinessImpl.execute();
        System.out.println("后拦截");
    }

}
