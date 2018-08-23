/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.flyweight.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 15:11
 **/
public interface BMWCar {
    double calculatePrice(BMWCarCustomisation custom);
    void printFullCharacteristics(BMWCarCustomisation custom);
}
