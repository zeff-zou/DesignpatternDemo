package com.designpattern.simpleFactory;

/**
 * Created by zzf on 2018/4/10.
 */
public class SimpleFactory {
    private SimpleFactory(){}

    public static IProduct createProduct(String productName){
        if (productName == null) {
            return null;
        }
        if (productName.equals("A")) {
            return new ProductA();
        }else if (productName.equals("B")) {
            return new ProductB();
        }else {
            return null;
        }
    }
}
