package com.designpattern.iterator;

/**
 * Created by zzf on 2018/4/19.
 */
public interface MyIterator {
    void first();//将游标指向第一个元素
    void next();//将游标指向下一个元素
    boolean hasNext();//判断是否有下一个元素

    boolean isFirst();//判断是否是第一个元素
    boolean isLast();//判断是否是最后一个元素
    Object getCurrentObj();//获取当前对象
}
