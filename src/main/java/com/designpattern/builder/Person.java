package com.designpattern.builder;

/**
 * Created by zzf on 2018/4/19.
 */
public class Person {
    private String name;
    private String appearance;
    private String body;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void show(){
        System.out.println("姓名:"+this.name+";相貌:"+this.appearance+";身体:"+this.body);
    }
}
