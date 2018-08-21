/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.prototype.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-20 12:49
 **/
public interface Product extends Cloneable {

    public void use(String t);

    public Product createClone();
}
