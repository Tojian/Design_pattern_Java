package com.proxy.pattern.DynamicProxy;

/**
 * Created by taojian on 2018/1/6 0006  下午 9:23.
 */
public class Host implements Rent {

    public void rent() {
        System.out.println("house is rented");
    }
}
