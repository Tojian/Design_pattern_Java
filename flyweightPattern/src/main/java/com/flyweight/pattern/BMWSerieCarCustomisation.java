/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.flyweight.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 15:19
 **/

class BMWSerieCarCustomisation implements BMWCarCustomisation {

    private int tireSize;
    private String laserSignature;

    public BMWSerieCarCustomisation(int tireSize, String laserSignature) {
        this.tireSize = tireSize;
        this.laserSignature = laserSignature;
    }

    public int getTireSize() {
        return tireSize;
    }

    public String getLaserSignature() {
        return laserSignature;
    }

    @Override
    public void printCustomisations() {
        System.out.println("Tire Size:" + getTireSize());
        System.out.println("LaserSignature:" + getLaserSignature());
        System.out.println("LaserSignature Size:" + getLaserSignature().length());
    }
}
