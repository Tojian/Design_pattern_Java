/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.facade.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 12:39
 **/
public class Computer {

    private CPU cpu;

    private Memeory memeory;

    private Disk disk;

    public Computer() {
        cpu = new CPU();
        memeory = new Memeory();
        disk = new Disk();
    }

    public void start() {
        System.out.println("Computer is start  begin.....");
        cpu.start();
        memeory.start();
        disk.start();
        System.out.println("Computer is start  end.....");
    }

    public void shutDown() {
        System.out.println("Computer is shutdown begin ----");
        cpu.shutDown();
        memeory.shutDown();
        disk.shutDown();
        System.out.println("Computer is shutdown end ----");
    }
}
