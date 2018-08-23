/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.composite.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 10:44
 **/
public abstract class Entry {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreamentException{
        throw new FileTreamentException();
    }

    public void printList(){
        printList(" ");
    }


    protected abstract  void printList(String prefix);

    public String toString(){
        return  getName() + "(" +getSize() + ")";
    }
}
