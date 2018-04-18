package com.designpattern.mediator;

/**
 * Created by zzf on 2018/4/18.
 */
public class EmployeeA extends Employee{
    @Override
    public void self() {
        System.out.println("EmployeeA:self");
        mediator.mediatorOperation(this);
    }
    @Override
    public void out() {
        System.out.println("EmployeeA:out");
    }
}
