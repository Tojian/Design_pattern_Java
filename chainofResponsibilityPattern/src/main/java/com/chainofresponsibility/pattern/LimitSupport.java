/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.chainofresponsibility.pattern;

/**
 * @description: 有限制的解决问题
 * @author: taojian
 * @create: 2018-08-24 09:26
 **/
public class LimitSupport extends Support {

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    protected boolean resolve(Trouble trouble) {

        if (trouble.getNumber() < limit) {
            return true;
        }
        return false;
    }
}
