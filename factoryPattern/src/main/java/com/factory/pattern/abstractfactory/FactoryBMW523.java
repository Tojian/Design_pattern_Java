package com.factory.pattern.abstractfactory;

/**
 * Created by taojian on 2018/1/7 0007  上午 10:54.
 */
public class FactoryBMW523 implements AbstarctFactory {

    @Override
    public Engine creatEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
