package com.designpattern.observer.event;

import java.util.EventListener;

/**
 * Created by zzf on 2018/4/13.
 */
public interface WriterListener extends EventListener {
    void addNovel(WriterEvent writerEvent);
}
