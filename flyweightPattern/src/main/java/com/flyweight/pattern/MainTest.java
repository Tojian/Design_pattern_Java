/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.flyweight.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 15:20
 **/
public class MainTest {

    public static void main(String[] args) {
        BMWCarFlyWeightFactory factory = new BMWSerieFlyWeightFactory();
        BMWCar serie1Car = factory.getBWMModel(BMWCarFlyWeightFactory.Model.Serie1);
        BMWCar serie1Car2 = factory.getBWMModel(BMWCarFlyWeightFactory.Model.Serie1);
        System.out.println("check for Object for Serie1:" + (serie1Car == serie1Car2));
        BMWCar serie2Car = factory.getBWMModel(BMWCarFlyWeightFactory.Model.Serie2);
        BMWCar serie2Car2 = factory.getBWMModel(BMWCarFlyWeightFactory.Model.Serie2);
        System.out.println("check for Object for Serie2:" + (serie2Car == serie2Car2));
        BMWCarCustomisation custom1 = new BMWSerieCarCustomisation(19, "Oh yeah");
        BMWCarCustomisation custom2 = new BMWSerieCarCustomisation(21, "For bob");
        BMWCarCustomisation custom3 = new BMWSerieCarCustomisation(26, "give it a ride !!");
        // BMW 1 Series
        System.out.println("BMW Serie1 + Custom1 Price:\nFull Price:" + serie1Car.calculatePrice(custom1));
        serie1Car.printFullCharacteristics(custom1);
        System.out.println("BMW Serie1 + Custom2 Price:\nFull Price:" + serie1Car.calculatePrice(custom2));
        serie1Car.printFullCharacteristics(custom2);
        System.out.println("BMW Serie1 + Custom3 Price:\nFull Price:" + serie1Car.calculatePrice(custom3));
        serie1Car.printFullCharacteristics(custom3);
        /// It's the samed BMW 1 Series Flyweight instance; the variant part is provided
        /// by the operation and customs
        // BMW 2 Series
        System.out.println("BMW Serie2 + Custom1 Price:\nFull Price:" + serie2Car.calculatePrice(custom1));
        serie2Car.printFullCharacteristics(custom1);
        System.out.println("BMW Serie2 + Custom2 Price:\nFull Price:" + serie2Car.calculatePrice(custom2));
        serie2Car.printFullCharacteristics(custom2);
        System.out.println("BMW Serie2 + Custom3 Price:\nFull Price:" + serie2Car.calculatePrice(custom3));
        serie2Car.printFullCharacteristics(custom3);
        /// It's the samed BMW 2 Series Flyweight instance; the variant part is provided
        /// by the operation and customs
    }
}
