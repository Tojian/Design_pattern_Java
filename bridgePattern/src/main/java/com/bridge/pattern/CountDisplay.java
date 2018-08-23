/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.bridge.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 10:02
 **/
public class CountDisplay extends Display{

    private DisplayImpl display;
    public CountDisplay(DisplayImpl display){
        super(display);
    }


    public void multiDisplay(int times){
        open();

        for (int i = 0 ; i < times ; i ++){
            print();

        }
        close();
    }
}
