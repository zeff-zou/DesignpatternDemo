package com.designpattern.decorator;

/**
 * Created by zzf on 2018/4/17.
 */
public class SugarDecorator extends DecoratorCoffee {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public void addSugar(){
        System.out.println("添加白糖;");
    }
    @Override
    public void getCoffee() {
        this.addSugar();
        super.getCoffee();
    }
}
