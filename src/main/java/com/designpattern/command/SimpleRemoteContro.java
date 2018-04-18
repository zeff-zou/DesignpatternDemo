package com.designpattern.command;

/**
 * Created by zzf on 2018/4/18.
 */
public class SimpleRemoteContro {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onButtonWasPushed() {
        command.execute();
    }
}
