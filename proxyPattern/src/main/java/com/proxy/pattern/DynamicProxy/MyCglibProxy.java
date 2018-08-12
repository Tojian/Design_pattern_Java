/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.proxy.pattern.DynamicProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-12 17:02
 **/
public class MyCglibProxy implements MethodInterceptor {

    public MyCglibProxy() {

    }

    public Object getProxyInstance(MyCglibProxy myProxy) {
        Enhancer enhancer = new Enhancer();
        // 将Enhancer中的superclass属性赋值成host
        enhancer.setSuperclass(Host.class);
        // 将Enhancer中的callbacks属性赋值成myProxy
        enhancer.setCallback(myProxy);
        return enhancer.create();
    }

    public Object intercept(Object object, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        log("调用的方法是：" + method.getName());
        log("实际调用者是： " + object.getClass());
        for (Object obj : objects) {
            log("方法参数类型为：" + obj.getClass());
        }
        Object result = methodProxy.invokeSuper(object, objects);
        System.out.println("这是方法后");
        return result;
    }

    public void log(String methodName) {
        System.out.println("执行" + methodName + "方法");
    }
}