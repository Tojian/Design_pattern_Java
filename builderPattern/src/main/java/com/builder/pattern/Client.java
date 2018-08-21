/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.builder.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-21 16:42
 **/

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        Product product1 = director.getAProduct();
        product1.showProduct();

        Product product2 = director.getBProduct();
        product2.showProduct();
    }

}
