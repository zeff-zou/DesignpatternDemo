package com.designpattern.builder;

/**
 * Created by zzf on 2018/4/19.
 */
public interface PersonBuilder {
    void buildName();
    void buildAppearance();
    void buildBody();
    Person buildPerson();
}
