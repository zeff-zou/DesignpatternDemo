package com.designpattern.decorator;

/**
 * Created by zzf on 2018/4/17.
 */
public class DecoratorCoffee implements Coffee{

    protected Coffee coffee;

    public DecoratorCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void getCoffee() {
        coffee.getCoffee();
    }
}
