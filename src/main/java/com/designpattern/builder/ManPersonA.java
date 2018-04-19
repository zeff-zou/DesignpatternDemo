package com.designpattern.builder;

/**
 * Created by zzf on 2018/4/19.
 */
public class ManPersonA implements PersonBuilder {

    private Person person;

    public ManPersonA() {
        person = new Person();//创建一个person实例，用于调用set方法
    }
    @Override
    public void buildName() {
        person.setName("zhangSan");
    }

    @Override
    public void buildAppearance() {
        person.setAppearance("英俊");
    }

    @Override
    public void buildBody() {
        person.setBody("强壮");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
