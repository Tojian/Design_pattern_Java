/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.chainofresponsibility.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-24 09:26
 **/
public class SpecialSupport extends Support {

    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        }
        return false;
    }
}
