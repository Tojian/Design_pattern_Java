/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.templatemethod.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-14 16:31
 **/
public abstract class AbstractDisplay {

    public abstract void open();

    public abstract  void close();

    public abstract void print();

    public final void display(){

        open();

        for (int i = 0 ; i < 5 ; i ++){
            print();
        }

        close();
    }
}
