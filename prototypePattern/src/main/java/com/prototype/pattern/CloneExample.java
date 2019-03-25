/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.prototype.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-21 15:11
 * <p>
 * 如何不实现Cloneable 接口会抛下面的错误
 * <p>
 * java.lang.CloneNotSupportedException: com.prototype.pattern.CloneExample
 * at java.lang.Object.clone(Native Method)
 * at com.prototype.pattern.CloneExample.clone(CloneExample.java:17)
 * at com.prototype.pattern.CloneExample.main(CloneExample.java:23)
 **/
public class CloneExample implements Cloneable {
    private int a;
    private int b;

    @Override
    protected CloneExample clone() throws CloneNotSupportedException {
        return (CloneExample) super.clone();
    }

    public static void main(String[] args) {
        CloneExample e1 = new CloneExample();
        CloneExample e2 = null;
        try {
            e2 = e1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1 == e2);
    }
}
