package com.proxy.pattern.DynamicProxy;

/**
 * Created by taojian on 2018/1/6 0006  下午 10:52.
 */
public class HelloServiceImpl implements  HelloService {
    public void sayHello(String hello){
        System.out.println(hello);
    }
}
