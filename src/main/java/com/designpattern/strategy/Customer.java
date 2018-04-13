package com.designpattern.strategy;

/**
 * Created by zzf on 2018/4/13.
 */
public class Customer {
    private Double totalAmount = 0D;//消费的总额
    private Double amount = 0D;//单次消费金额
    private CalPrice calPrice = CalPriceFactory.getInstance(this);

    public void buy(Double amount){
        this.amount = amount;
        totalAmount += amount;
        //从工厂类中取出实际的计算价格类
        calPrice = CalPriceFactory.getInstance(this);
    }
    //计算最终要付的钱
    public Double calLastAmount(){
        return calPrice.calPrice(amount);
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public Double getAmount() {
        return amount;
    }
}
