package com.singleton.pattern.test;

import org.junit.Assert;

import com.singleton.pattern.SingletonTest;

/**
 * Created by taojian on 2018/1/7 0007  上午 8:46.
 */
public class Test {
    public static void main(String[] args) {
       // SingletonTest singletonTest = new SingletonTest();
        SingletonTest singletonTest = SingletonTest.getInstance();
        SingletonTest singletonTest1 = SingletonTest.getInstance();
        Assert.assertEquals(singletonTest , singletonTest1);
    }
}
