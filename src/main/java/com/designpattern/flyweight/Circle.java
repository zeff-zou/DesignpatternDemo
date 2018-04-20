package com.designpattern.flyweight;

/**
 * Created by zzf on 2018/4/20.
 */
public class Circle implements Shape {
    private String colour;//内蕴状态
    private String radius;//外蕴状态

    public Circle(String colour) {
        this.colour = colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("画了一个颜色="+colour+",半径="+radius+"的圆形");
    }
}
