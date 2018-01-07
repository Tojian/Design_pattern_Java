package com.factory.pattern.abstractfactory;

/**
 * Created by taojian on 2018/1/7 0007  上午 10:55.
 */
public class Customer {
    public static void main(String[] args){
        //生产宝马320系列配件
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.creatEngine();
        factoryBMW320.createAircondition();

        //生产宝马523系列配件
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW320.creatEngine();
        factoryBMW320.createAircondition();
    }
}
