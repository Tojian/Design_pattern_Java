/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.prototype.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-20 12:49
 **/
public class ManagerBox implements Product {

    private char decochar;

    public ManagerBox(char decochar) {
        this.decochar = decochar;
    }

    public void use(String s) {

        int length = s.getBytes().length;

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }

    public Product createClone() {

        Product p = null;

        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
