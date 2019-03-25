/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.prototype.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-20 12:49
 **/
public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        ManagerBox mBox = new ManagerBox('*');
        ManagerBox sBox = new ManagerBox('/');
        manager.register("strong message",underlinePen);
        manager.register("warning box",mBox);
        manager.register("slash box",sBox);

        Product p1 = manager.create("strong message");
        p1.use("Hello , world");
        System.out.println("");
        Product p2 = manager.create("warning box");
        p2.use("Hello , world");
        System.out.println("");
        Product p3 = manager.create("slash box");
        p3.use("Hello , world");


    }
}
