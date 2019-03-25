/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.flyweight.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 15:17
 **/
public class BMWSerie1Factory implements BMWCarFactory {

    @Override
    public BMWCar createCar() {
        return new BMWSerie1();
    }
}
