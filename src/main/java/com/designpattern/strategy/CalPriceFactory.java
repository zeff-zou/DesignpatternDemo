package com.designpattern.strategy;

/**
 * Created by zzf on 2018/4/13.
 */
public class CalPriceFactory {

    private CalPriceFactory(){}

    private static class SingletonHelp  {
        static CalPrice common = new Common();
        static CalPrice vip = new Vip();
        static CalPrice superVip = new superVip();
    }

    public static CalPrice getInstance(Customer customer) {
        if (customer.getTotalAmount() >= 3000){
            return SingletonHelp.superVip;
        }else if (customer.getTotalAmount() >= 2000){
            return SingletonHelp.vip;
        }else {
            return  SingletonHelp.common;
        }
    }
}
