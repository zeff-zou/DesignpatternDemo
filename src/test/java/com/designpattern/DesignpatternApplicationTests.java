package com.designpattern;

import com.designpattern.abstractFactory.*;
import com.designpattern.adapter.DefaultAdapter.Man;
import com.designpattern.adapter.classAdapter.Adapter;
import com.designpattern.adapter.objectAdapter.ObjectAdater;
import com.designpattern.factoryMethod.Factory;
import com.designpattern.factoryMethod.ProductAFactory;
import com.designpattern.factoryMethod.ProductBFactory;
import com.designpattern.observer.integrated.Reader;
import com.designpattern.observer.integrated.Writer;
import com.designpattern.observer.simple.Observable;
import com.designpattern.observer.simple.Observer1;
import com.designpattern.observer.simple.Observer2;
import com.designpattern.proxy.BussinessImpl;
import com.designpattern.proxy.BussinessProxy;
import com.designpattern.proxy.IBussiness;
import com.designpattern.proxy.ProxyFactory;
import com.designpattern.simpleFactory.IProduct;
import com.designpattern.simpleFactory.SimpleFactory;
import com.designpattern.singleton.*;
import com.designpattern.strategy.Customer;
import com.designpattern.templateMethod.Cabbage;
import com.designpattern.templateMethod.Tomato;
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
    /**
     * 抽象工厂模式
     */
    @Test
    public void abstarctFactory(){
        AbstarctFactory factory = new ProductOnefactory();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        productA.methodA();
        productB.methodB();
        factory = new ProductTwofactory();
        productA = factory.createProductA();
        productB = factory.createProductB();
        productA.methodA();
        productB.methodB();
    }
    /**
     * 观察者模式
     */
    @Test
    public void Observer(){
        //简单观察者例子
        Observable observable = new Observable();
        observable.addObserver(new Observer1());
        observable.addObserver(new Observer2());
        observable.changed();

        //读者订阅作者例子
        //初始化作者
        Writer tomato = new Writer("tomato");
        Writer potato = new Writer("potato");
        //初始化读者
        Reader zhangSan = new Reader("zhangSan");
        Reader lisi = new Reader("lisi");
        Reader wangwu = new Reader("wangwu");
        //设置读者订阅作者
        zhangSan.subscribe(tomato.getName());
        zhangSan.subscribe(potato.getName());
        lisi.subscribe(tomato.getName());
        wangwu.subscribe(potato.getName());
        //作者发布新书
        potato.addNovel("doPoChangQ");
        tomato.addNovel("pangL");
        //取消订阅
        wangwu.unsubscribe(potato.getName());
        //作者发布新书
        potato.addNovel("wuDongQianK");

        //读者订阅例子(事件驱动模型)
        com.designpattern.observer.event.Writer tomato1 = new com.designpattern.observer.event.Writer("tomato1");
        com.designpattern.observer.event.Writer potato1 = new com.designpattern.observer.event.Writer("potato1");

        com.designpattern.observer.event.Reader zhansan1 = new com.designpattern.observer.event.Reader("zhansan1");
        com.designpattern.observer.event.Reader lisi1 = new com.designpattern.observer.event.Reader("lisi");
        zhansan1.subscribe("tomato1");
        lisi1.subscribe("tomato1");
        lisi1.subscribe("potato1");

        tomato1.addNovel("pangL");
        potato1.addNovel("doPoChangQ");
    }
    /**
     * 策略模式
     */
    @Test
    public void strategy(){
        Customer customer = new Customer();
        customer.buy(1000.00);
        System.out.println("实际付款:"+customer.calLastAmount());
        customer.buy(1000.00);
        System.out.println("实际付款:"+customer.calLastAmount());
        customer.buy(1000.00);
        System.out.println("实际付款:"+customer.calLastAmount());
    }
    /**
     * 适配器模式
     */
    @Test
    public void adpater(){
        //类适配器
        Adapter adapter = new Adapter();
        adapter.method1();
        adapter.method2();
        //对象适配器
        ObjectAdater objectAdater = new ObjectAdater();
        objectAdater.method1();
        objectAdater.method2();
        objectAdater.method3();
        //缺省适配器
        Man man = new Man();
        man.speak();
        man.listen();
        man.work();
    }
    /**
     * 模板方法模式
     */
    @Test
    public void templateMethod(){
        Cabbage cabbage = new Cabbage();
        cabbage.cookProcess();

        Tomato tomato = new Tomato();
        tomato.cookProcess();
    }
}
