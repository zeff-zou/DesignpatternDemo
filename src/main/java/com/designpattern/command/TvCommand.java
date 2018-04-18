package com.designpattern.command;

/**
 * Created by zzf on 2018/4/18.
 */
public class TvCommand implements Command {

    private Tv tv;

    public TvCommand(Tv tv) {
        this.tv = tv;
    }


    @Override
    public void execute() {
        tv.on();
    }
}
