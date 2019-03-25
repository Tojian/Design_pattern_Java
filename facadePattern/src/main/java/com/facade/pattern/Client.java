/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.facade.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 12:39
 **/
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        System.out.println("================");
        computer.shutDown();
    }
}
