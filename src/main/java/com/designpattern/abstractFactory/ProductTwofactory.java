package com.designpattern.abstractFactory;

/**
 * Created by zzf on 2018/4/12.
 */
public class ProductTwofactory implements AbstarctFactory {
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
