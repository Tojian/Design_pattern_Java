/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.builder.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-21 16:41
 **/
public class ConcreteBuilder extends Builder {

    private Product product = new Product();

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public void setPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }

}
