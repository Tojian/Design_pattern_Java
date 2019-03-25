/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.flyweight.pattern;

/**
 * @description: 测试程序
 * @author: taojian
 * @create: 2018-08-23 14:50
 **/
public class Main {

    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Usage : java Main digits");
            System.out.println("Example : java Main 1212123");
            System.exit(0);
        }

        BigString bigString = new BigString(args[0]);
        bigString.print();
    }
}
