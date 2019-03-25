/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.bridge.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 10:13
 **/
public class Main {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("hello world"));
        Display d2 = new CountDisplay(new StringDisplayImpl("hello taojian"));
        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("hello may"));
        d1.display();
        d2.display();
        countDisplay.display();
        countDisplay.multiDisplay(5);
    }
}
