/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.builder.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-21 16:40
 **/
public class Product {

    private String name;

    private  String type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showProduct(){
        System.out.println("名称："+name);
        System.out.println("型号："+type);
    }
}
