/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.flyweight.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 15:14
 **/
public class BMWSerie1  implements BMWCar{
    private final static double BASE_PRICE = 25000;

    @Override
    public double calculatePrice(BMWCarCustomisation custom) {
        return BASE_PRICE + getSpecificSerie1PriceBasedOnCustom(custom) + getExportationTaxe(custom);
    }

    @Override
    public void printFullCharacteristics(BMWCarCustomisation custom) {
        // print all BMW 1 Series specific characteristics
        // (codes in there)
        custom.printCustomisations(); // print details based on these customisations
    }

    private double getSpecificSerie1PriceBasedOnCustom(BMWCarCustomisation custom) {
        // (e.g., calculation based on custom specific to Series 1)
        double sum = 0;
        if (custom.getTireSize() == 19) {
            sum += 1200;
        } else {
            sum += 2100;
        }
        return sum;
    }

    private double getExportationTaxe(BMWCarCustomisation custom) {
        // (calculation based on custom exportation taxes only for this model)
        double sum = 0;
        if (!custom.getLaserSignature().isEmpty()) {
            sum += 987;
        }
        return sum;
    }
}
