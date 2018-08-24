/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.chainofresponsibility.pattern;

/**
 * @description: 永远不解决问题
 * @author: taojian
 * @create: 2018-08-24 09:26
 **/
public class NoSupport extends Support {

    public NoSupport(String name){
        super(name);
    }
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
