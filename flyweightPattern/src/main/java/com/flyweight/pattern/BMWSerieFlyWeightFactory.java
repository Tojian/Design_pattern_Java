/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.flyweight.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 15:18
 **/
public class BMWSerieFlyWeightFactory implements BMWCarFlyWeightFactory {

    private Map<Model, BMWCar> cache = new HashMap<>();

    public synchronized BMWCar getBWMModel(Model m) {
        if (!cache.containsKey(m)) {
            BMWCarFactory concreteFactory;
            switch (m) {
                case Serie2:
                    concreteFactory = new BMWSerie2Factory();
                    break;
                case Serie3:
                    concreteFactory = new BMWSerie3Factory();
                    break;
                /*
                 * Just code to have a hint !
                 */
                default:
                    concreteFactory = new BMWSerie1Factory();
                    break;
            }
            cache.put(m, concreteFactory.createCar());
        }
        return cache.get(m);
    }
}
