package com.designpattern;

import com.designpattern.singleton.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignpatternApplicationTests {

	@Test
	public void contextLoads() {
	}

    /**
     * 单例模式
     */
	@Test
	public void singleton() {
        //饿汉式
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        hungrySingleton.sayHi();
        //懒汉式
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.sayHi();
        //加锁
        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
        synchronizedSingleton.sayHi();
        //双重加锁
        DoubleSynSingleton synSingleton = DoubleSynSingleton.getInstance();
        synSingleton.sayHi();
        //静态内部类
        InternalClassSingleton internalClassSingleton = InternalClassSingleton.getInstance();
        internalClassSingleton.sayHi();
        InternalClassSingleton aaa = InternalClassSingleton.getInstance();
        aaa.sayHi();
    }
}
