package com.proxy.pattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by taojian on 2018/1/6 0006  下午 9:50.
 */
public class DynamicProxyHandler implements InvocationHandler {
    // 目标对象--真实对象
    private Object target;

    /**
     * 生成代理类
     */
    public Object getProxy(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    /**
     * proxy是代理类
     * method 代理类的调用处理程序的方法对象
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;

    }

    public void log(String methodName) {
        System.out.println("执行" + methodName + "方法");
    }
}


