package com.designpattern.mediator;

/**
 * Created by zzf on 2018/4/18.
 */
public abstract class Employee {

    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void self();
    public  abstract void out();
}
