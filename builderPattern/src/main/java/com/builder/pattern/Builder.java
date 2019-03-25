/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.builder.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-21 16:41
 **/
public abstract class Builder {

    public abstract void setPart(String arg1, String arg2);
    public abstract Product getProduct();

}
