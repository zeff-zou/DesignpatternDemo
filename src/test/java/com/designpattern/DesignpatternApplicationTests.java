package com.designpattern;

import com.designpattern.factoryMethod.Factory;
import com.designpattern.factoryMethod.ProductAFactory;
import com.designpattern.factoryMethod.ProductBFactory;
import com.designpattern.proxy.BussinessImpl;
import com.designpattern.proxy.BussinessProxy;
import com.designpattern.proxy.IBussiness;
import com.designpattern.proxy.ProxyFactory;
import com.designpattern.simpleFactory.IProduct;
import com.designpattern.simpleFactory.SimpleFactory;
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


    /**
     * 代理模式
     */
    @Test
    public void proxy(){
        //静态代理
        BussinessProxy proxy = new BussinessProxy();
        proxy.setBussinessImpl(new BussinessImpl());
        proxy.execute();
        //动态代理
        ProxyFactory proxyFactory = new ProxyFactory(new BussinessImpl());
        IBussiness bussiness = (IBussiness) proxyFactory.getConnectionProxy();
        bussiness.execute();
    }
    /**
     * 简单工厂模式
     */
    @Test
    public void simpleFactory(){
        IProduct a = SimpleFactory.createProduct("A");
        a.method();
        IProduct b = SimpleFactory.createProduct("B");
        b.method();
    }
    /**
     * 工厂方法模式
     */
    @Test
    public void  factoryMethod(){
        Factory factory = new ProductAFactory();
        com.designpattern.factoryMethod.IProduct iProductA = factory.careateProduct();
        iProductA.method();
        factory = new ProductBFactory();
        com.designpattern.factoryMethod.IProduct iProductB = factory.careateProduct();
        iProductB.method();
    }
}
