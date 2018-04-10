package com.designpattern.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zzf on 2018/4/10.
 */
public class ProxyFactory implements InvocationHandler{

    private Object targetObject;

    public ProxyFactory(Object targetObject) {
        super();
        this.targetObject = targetObject;
    }

    private void before(){
        System.out.println("before");
    }

    private void after(){
        System.out.println("after");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("execute")) {
            before();
        }
        Object result = method.invoke(targetObject, args);
        if (method.getName().equals("execute")) {
            after();
        }
        return result;
    }

    public Object getConnectionProxy(){
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(), this);
    }
}
