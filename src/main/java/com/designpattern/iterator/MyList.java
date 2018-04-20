package com.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzf on 2018/4/20.
 */
public class MyList {
    private List<Object> list = new ArrayList<>();
    public void addObject(Object obj){
        this.list.add(obj);
    }
    public void removeObject(Object obj){
        this.list.remove(obj);
    }
    public List<Object> getList() {
        return list;
    }
    public void setList(List<Object> list) {
        this.list = list;
    }
    //获得迭代器
    public MyIterator createIterator(){
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements MyIterator{
        //定义一个迭代器游标
        private int cursor;

        @Override
        public void first() {
            this.cursor = 0;
        }

        @Override
        public void next() {
            if (cursor<list.size()) {
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            //如果游标<list的大小，则说明还有下一个
            if (cursor<list.size()) {
                return true;
            }
            return false;
        }

        @Override
        public boolean isFirst() {
            //判断游标是否是容器的第一个
            return cursor==0?true:false;
        }

        @Override
        public boolean isLast() {
            //判断游标是否是容器的最后一个
            return cursor==(list.size()-1)?true:false;
        }

        @Override
        public Object getCurrentObj() {
            //获取当前游标指向的元素
            return list.get(cursor);
        }
    }
}
