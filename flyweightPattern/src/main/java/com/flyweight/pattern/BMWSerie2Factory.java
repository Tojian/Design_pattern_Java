/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.flyweight.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 15:16
 **/
public class BMWSerie2Factory implements BMWCarFactory {

    @Override
    public BMWCar createCar() {
        return new BMWSerie1();
    }

}
