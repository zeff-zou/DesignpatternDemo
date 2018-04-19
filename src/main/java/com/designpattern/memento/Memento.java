package com.designpattern.memento;

/**
 * Created by zzf on 2018/4/19.
 */
public class Memento {
    private int state;

    public Memento() {}

    public Memento(int state) {
        this.state = state;
        System.out.println("备忘录当前保存状态：" + state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
