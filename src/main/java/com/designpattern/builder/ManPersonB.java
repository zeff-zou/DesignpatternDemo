package com.designpattern.builder;

/**
 * Created by zzf on 2018/4/19.
 */
public class ManPersonB implements PersonBuilder {

    private Person person;

    public ManPersonB() {
        person = new Person();//创建一个person实例，用于调用set方法
    }
    @Override
    public void buildName() {
        person.setName("liSi");
    }

    @Override
    public void buildAppearance() {
        person.setAppearance("丑陋");
    }

    @Override
    public void buildBody() {
        person.setBody("瘦小");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
