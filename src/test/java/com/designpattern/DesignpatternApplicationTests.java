package com.designpattern;

import com.designpattern.abstractFactory.*;
import com.designpattern.adapter.DefaultAdapter.Man;
import com.designpattern.adapter.classAdapter.Adapter;
import com.designpattern.adapter.objectAdapter.ObjectAdater;
import com.designpattern.bridge.Circle;
import com.designpattern.bridge.Rectangle;
import com.designpattern.bridge.Red;
import com.designpattern.bridge.White;
import com.designpattern.builder.Director;
import com.designpattern.builder.ManPersonA;
import com.designpattern.builder.ManPersonB;
import com.designpattern.builder.Person;
import com.designpattern.command.*;
import com.designpattern.decorator.Coffee;
import com.designpattern.decorator.ConcreteCafe;
import com.designpattern.decorator.MilkDecorator;
import com.designpattern.decorator.SugarDecorator;
import com.designpattern.facade.ParentSreviceImpl;
import com.designpattern.facade.Sub1ServiceImpl;
import com.designpattern.facade.Sub2ServiceImpl;
import com.designpattern.factoryMethod.Factory;
import com.designpattern.factoryMethod.ProductAFactory;
import com.designpattern.factoryMethod.ProductBFactory;
import com.designpattern.mediator.Employee;
import com.designpattern.mediator.EmployeeA;
import com.designpattern.mediator.EmployeeB;
import com.designpattern.mediator.MediatorImpl;
import com.designpattern.memento.Caretaker;
import com.designpattern.memento.Originator;
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
    /**
     * 装饰器模式
     */
    @Test
    public void decorator(){
        //原对象
        Coffee coffee = new ConcreteCafe();
        coffee.getCoffee();
        //装饰成MilkDecorator
        MilkDecorator milkDecorator = new MilkDecorator(coffee);
        milkDecorator.getCoffee();
        //装饰成SugarDecorator
        SugarDecorator sugarDecorator = new SugarDecorator(coffee);
        sugarDecorator.getCoffee();
    }
    /**
     * 外观模式
     */
    @Test
    public void facade(){
        ParentSreviceImpl parentSrevice = new ParentSreviceImpl(new Sub1ServiceImpl(), new Sub2ServiceImpl());
        parentSrevice.function();
    }
    /**
     * 命令模式
     */
    @Test
    public void command(){
        //被调用者
        Light light = new Light();
        Tv tv = new Tv();
        //命令
        LightCommand lightCommand = new LightCommand(light);
        TvCommand tvCommand = new TvCommand(tv);
        //调用者
        SimpleRemoteContro contro = new SimpleRemoteContro();

        contro.setCommand(lightCommand);
        contro.onButtonWasPushed();
        contro.setCommand(tvCommand);
        contro.onButtonWasPushed();
    }
    /**
     * 中介者模式
     */
    @Test
    public void mediator(){
        //创建员工
        Employee employeeA = new EmployeeA();
        Employee employeeB = new EmployeeB();
        //创建中介者
        MediatorImpl mediator = new MediatorImpl();
        //将中介者与员工绑定
        mediator.addEmployee(employeeA);
        mediator.addEmployee(employeeB);
        //执行任务
        employeeA.self();//A将会通过中介在调用其他员工的out方法，如:A员工
        employeeB.self();//B将会通过中介在调用其他员工的out方法，如:B员工
    }
    /**
     * 桥接模式
     */
    @Test
    public void bridge(){
        //定义颜色
        White white = new White();
        Red red = new Red();

        //创建正方形
        Circle circle = new Circle();
        circle.setColour(white);
        circle.draw();
        circle.setColour(red);
        circle.draw();

        //创建长方形
        Rectangle rectangle = new Rectangle();
        rectangle.setColour(white);
        rectangle.draw();
        rectangle.setColour(red);
        rectangle.draw();
    }
    /**
     * 建造者模式
     */
    @Test
    public void builder(){
        //创建建造者
        Director director = new Director();

        Person person = director.constructPerson(new ManPersonA());
        person.show();
        Person personB = director.constructPerson(new ManPersonB());
        personB.show();
    }
    /**
     * 备忘录模式
     */
    @Test
    public void memento(){
        int state = 3;
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState(state);
        //缓存状态
        caretaker.setMemento(originator.creatMemento());
        //设置新的状态
        originator.setState(5);
        System.out.println("发起人最新状态:" + originator.getState());
        //还原状态
        originator.restoreMemento(caretaker.getMemento());
    }
}
