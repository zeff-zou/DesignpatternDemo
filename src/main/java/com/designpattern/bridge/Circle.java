package com.designpattern.bridge;

/**
 * Created by zzf on 2018/4/19.
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        colour.bepaint("正方形");
    }
}
