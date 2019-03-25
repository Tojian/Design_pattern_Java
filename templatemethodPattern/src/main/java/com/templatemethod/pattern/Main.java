/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.templatemethod.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-14 16:31
 **/
public class Main {

    public static void main(String[] args) {
        AbstractDisplay display1 = new CharDisplay('T');

        AbstractDisplay display2 = new StringDisplay("tao jian");

        AbstractDisplay display3 = new StringDisplay("你好 世界");

        display1.display();
        display2.display();
        display3.display();

    }
}
