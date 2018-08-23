/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.flyweight.pattern;

/**
 * @description: 表示多个BigChar 组成的大型字符串的类
 * @author: taojian
 * @create: 2018-08-23 14:50
 **/
public class BigString {

    private BigChar[] bigChars;

    public BigString(String string) {

        bigChars = new BigChar[string.length()];

        BigCharFactory factory = BigCharFactory.getInstance();

        for (int i = 0; i < bigChars.length; i++) {
            // 共享
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
