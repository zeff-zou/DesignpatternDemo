package com.designpattern.chain;

/**
 * Created by zzf on 2018/4/20.
 */
public abstract class AbstractCook {

    //责任链中的下一个元素
    protected AbstractCook nextCook;

    public void setNextCook(AbstractCook nextCook) {
        this.nextCook = nextCook;
    }

    public void startOperator(){
        operator();
        if(nextCook !=null){
            nextCook.startOperator();
        }
    }

     public abstract void operator();
}
