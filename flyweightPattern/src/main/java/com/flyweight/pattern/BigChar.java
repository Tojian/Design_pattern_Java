/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.flyweight.pattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @description: 表示大型的字符的类
 * @author: taojian
 * @create: 2018-08-23 14:50
 **/
public class BigChar {

    private char charname;

    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("big" + charname
                    + ".txt"));
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }


    public void print(){
        System.out.println(fontdata);

    }}
