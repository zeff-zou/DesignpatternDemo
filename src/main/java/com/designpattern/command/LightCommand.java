package com.designpattern.command;

/**
 * Created by zzf on 2018/4/18.
 */
public class LightCommand implements Command {

    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
