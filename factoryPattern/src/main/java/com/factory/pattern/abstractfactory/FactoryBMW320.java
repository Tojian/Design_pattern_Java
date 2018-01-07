package com.factory.pattern.abstractfactory;

/**
 * Created by taojian on 2018/1/7 0007  上午 10:53.
 */
public class FactoryBMW320 implements AbstarctFactory {
    @Override
    public Engine creatEngine() {
        return new EngineA();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
