package com.designpattern.bridge;

/**
 * Created by zzf on 2018/4/19.
 */
public abstract class Shape {
    public Colour colour;

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public abstract void draw();
}
