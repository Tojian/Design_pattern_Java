/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.flyweight.pattern;

public interface BMWCarCustomisation {
    // customize Tire size
    int getTireSize();
    String getLaserSignature();
    // a lot of customisation attributes can be in there for a BMW car
    void printCustomisations();
}
