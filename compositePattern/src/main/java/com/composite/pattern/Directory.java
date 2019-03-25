/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.composite.pattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 10:44
 **/

public class Directory extends Entry {

    private String name;

    private ArrayList directory = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {

        int size = 0;

        Iterator it = directory.iterator();

        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    protected void printList(String prefix) {

        System.out.println(prefix + "/" + this);

        Iterator it = directory.iterator();

        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
