/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.flyweight.pattern;

import java.util.HashMap;

/**
 * @description: 表示生成和公用BigChar 类的实例的类
 * @author: taojian
 * @create: 2018-08-23 14:50
 **/
public class BigCharFactory {

    private HashMap pool = new HashMap();

    private static BigCharFactory sigleton = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return sigleton;
    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = (BigChar) pool.get(charname);
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
