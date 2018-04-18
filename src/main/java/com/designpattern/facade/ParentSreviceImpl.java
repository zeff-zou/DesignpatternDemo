package com.designpattern.facade;

/**
 * Created by zzf on 2018/4/18.
 */
public class ParentSreviceImpl implements ParentSrevice{

    private Sub1Service sub1Service;
    private Sub2Service sub2Service;

    public ParentSreviceImpl(Sub1Service sub1Service, Sub2Service sub2Service) {
        this.sub1Service = sub1Service;
        this.sub2Service = sub2Service;
    }

    @Override
    public void function() {
        sub1Service.function1();
        sub2Service.function2();
    }
}
