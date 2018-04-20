package com.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zzf on 2018/4/20.
 */
public class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
        }
        return circle;
    }

    public static void getNmber(){
        System.out.println("实际存在对象数量:"+circleMap.size());
    }
}
