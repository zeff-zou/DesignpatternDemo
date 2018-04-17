package com.designpattern.decorator;

/**
 * Created by zzf on 2018/4/17.
 */
public class MilkDecorator extends DecoratorCoffee{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    public void addMilk(){
        System.out.println("添加牛奶;");
    }
    @Override
    public void getCoffee() {
        this.addMilk();
        super.getCoffee();
    }
}
