/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.chainofresponsibility.pattern;

/**
 * @description: 解决奇数类的问题
 * @author: taojian
 * @create: 2018-08-24 09:26
 **/
public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        }
        return false;
    }
}
