package com.designpattern.templateMethod;

/**
 * Created by zzf on 2018/4/17.
 */
public abstract class Cook {

    public final void cookProcess(){
        this.putOil();
        this.putVegetable();
        this.putSauce();
        this.stirFry();
    }

    public void putOil(){
        System.out.println("倒油");
    }

    abstract void putVegetable();

    abstract void putSauce();

    public void stirFry(){
        System.out.println("炒熟");
    }
}
