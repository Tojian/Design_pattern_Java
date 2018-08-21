/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.builder.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-21 16:41
 **/
public class ConcreteBuilder extends Builder {

    private Product product = new Product();

    public Product getProduct() {
        return product;
    }

    public void setPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }

}
