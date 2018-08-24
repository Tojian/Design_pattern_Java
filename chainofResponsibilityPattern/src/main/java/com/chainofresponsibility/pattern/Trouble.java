/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.chainofresponsibility.pattern;

/**
 * @description: 发生问题的类
 * @author: taojian
 * @create: 2018-08-24 09:26
 **/
public class Trouble {

    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "[Trouble" + number + "]";
    }
}
