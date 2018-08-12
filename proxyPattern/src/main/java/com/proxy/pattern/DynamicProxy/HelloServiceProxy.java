package com.proxy.pattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by taojian on 2018/1/6 0006  下午 10:49.
 */
public class HelloServiceProxy implements InvocationHandler {

    private Object target;

    /**
     * 绑定委托对象并返回一个【代理占位】
     *
     * @param target 真实对象
     *
     * @return 代理对象【占位】
     */
    public Object bind(Object target, Class[] interfaces) {
        this.target = target;
        //取得代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    /**
     * 同过代理对象调用方法首先进入这个方法.
     *
     * @param proxy  --代理对象
     * @param method -- 方法,被调用方法.
     * @param args   -- 方法的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("############我是JDK动态代理################");
        Object result = null;
        //反射方法前调用
        System.err.println("我准备说hello。");
        //反射执行方法  相当于调用target.sayHelllo;
        result = method.invoke(target, args);
        //反射方法后调用.
        System.err.println("我说过hello了");
        return result;
    }
}
