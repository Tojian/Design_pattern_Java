/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.flyweight.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 15:15
 **/
public class BMWSerie3 implements BMWCar {

    private final static double BASE_PRICE = 28000;

    @Override
    public double calculatePrice(BMWCarCustomisation custom) {
        return BASE_PRICE + getSpecificSerie2PriceBasedOnCustom(custom);
    }

    @Override
    public void printFullCharacteristics(BMWCarCustomisation custom) {
        // print all BMW 2 Series specific characteristics
        // (codes in there)
        custom.printCustomisations(); // print details based on these customisations
    }

    private double getSpecificSerie2PriceBasedOnCustom(BMWCarCustomisation custom) {
        // (e.g., calculation based on custom specific to Series 2)
        double sum = 0;
        if (custom.getTireSize() == 19) {
            sum += 2000;
        } else {
            sum += 3000;
        }
        if (!custom.getLaserSignature().isEmpty()) {
            if (custom.getLaserSignature().length() > 10) {
                sum += 1200;
            } else {
                sum += 400;
            }
        }
        return sum;
    }
}
