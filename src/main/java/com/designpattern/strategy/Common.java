package com.designpattern.strategy;

/**
 * Created by zzf on 2018/4/13.
 */
public class Common implements CalPrice {
    @Override
    public Double calPrice(Double price) {
        return price;
    }
}
