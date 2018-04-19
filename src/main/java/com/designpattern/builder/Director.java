package com.designpattern.builder;

/**
 * Created by zzf on 2018/4/19.
 */
public class Director {
    public Person constructPerson(PersonBuilder pb) {
        //创建人物
        pb.buildName();
        pb.buildAppearance();
        pb.buildBody();
        return pb.buildPerson();
    }
}
