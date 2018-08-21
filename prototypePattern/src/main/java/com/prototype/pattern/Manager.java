/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.prototype.pattern;

import java.util.HashMap;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-20 12:49
 **/
public class Manager {

    private HashMap showcase = new HashMap();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String productName) {
        Product product = (Product) showcase.get(productName);
        return product.createClone();
    }
}
