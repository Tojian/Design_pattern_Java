/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.templatemethod.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-14 16:31
 **/
public class CharDisplay extends AbstractDisplay{

    private  char aChar;

    public CharDisplay(char aChar){
        this.aChar = aChar;
    }
    public void open() {
        System.out.println("<<<<<<<<<<<<<<<");
    }

    public void close() {
        System.out.println(">>>>>>>>>>>>>>>>");
    }

    public void print() {
        System.out.print(aChar);
    }
}
