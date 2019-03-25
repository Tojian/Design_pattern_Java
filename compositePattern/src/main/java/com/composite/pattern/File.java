/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.composite.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 10:44
 **/
public class File extends  Entry{

    private String name;

    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    protected void printList(String prefix) {

        System.out.println(prefix + "/" + this);
    }
}
