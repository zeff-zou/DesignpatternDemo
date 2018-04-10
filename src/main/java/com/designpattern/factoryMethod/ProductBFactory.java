package com.designpattern.factoryMethod;

/**
 * Created by zzf on 2018/4/10.
 */
public class ProductBFactory implements Factory {
    @Override
    public IProduct careateProduct() {
        return new ProductB();
    }
}
