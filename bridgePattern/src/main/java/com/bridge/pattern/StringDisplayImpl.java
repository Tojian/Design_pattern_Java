/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.bridge.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 10:02
 **/
public class StringDisplayImpl extends DisplayImpl {

    private String string;

    private int width;

    public StringDisplayImpl(String s) {
        this.string = s;
        this.width = s.getBytes().length;

    }

    public void rawOpen() {
        printLine();
    }

    public void rawprint() {
        System.out.println("|" + string + "|");
    }

    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");

        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");

    }
}
