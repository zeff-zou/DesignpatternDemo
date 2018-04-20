package com.designpattern.chain;

/**
 * Created by zzf on 2018/4/20.
 */
public class WashFood extends AbstractCook {
    @Override
    public void operator() {
        System.out.println("洗菜");
    }
}
