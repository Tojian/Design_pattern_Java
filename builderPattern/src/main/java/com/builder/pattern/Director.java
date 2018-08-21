/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.builder.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-21 16:42
 **/
public class Director {

    private Builder builder = new ConcreteBuilder();

    public Product getAProduct() {
        builder.setPart("宝马汽车", "X7");
        return builder.getProduct();
    }

    public Product getBProduct() {
        builder.setPart("奥迪汽车", "Q5");
        return builder.getProduct();

    }
}
