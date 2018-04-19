package com.designpattern.memento;

/**
 * Created by zzf on 2018/4/19.
 */
public class Originator {

    private int state = 0;

    Caretaker caretaker = new Caretaker();

    public Memento creatMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
        System.out.println("恢复备忘录状态:" + state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
