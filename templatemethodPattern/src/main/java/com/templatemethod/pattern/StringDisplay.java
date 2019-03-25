/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.templatemethod.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-14 16:31
 **/
public class StringDisplay extends AbstractDisplay {

    private String string;

    private int width;

    public StringDisplay(String string) {
        this.string = string;

        this.width = string.getBytes().length;
    }

    public void open() {

        printLine();
    }

    public void close() {
        printLine();
    }

    public void print() {
        System.out.println("|" + string + "|");
    }

    private void printLine() {

        System.out.print("+");

        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }

        System.out.println("+");
    }
}
