/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.flyweight.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 15:14
 **/
public interface BMWCarFlyWeightFactory {
    enum Model {Serie1, Serie2, Serie3};
    BMWCar getBWMModel(Model m);
}
