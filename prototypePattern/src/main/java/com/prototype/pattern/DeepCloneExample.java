/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.prototype.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-21 15:45
 **/
public class DeepCloneExample implements Cloneable{

    private int[] arr;

    public DeepCloneExample() {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int get(int index) {
        return arr[index];
    }

    @Override
    protected DeepCloneExample clone() throws CloneNotSupportedException {
        DeepCloneExample result = (DeepCloneExample) super.clone();
        result.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result.arr[i] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        DeepCloneExample e1 = new DeepCloneExample();
        DeepCloneExample e2 = null;
        try {
            e2 = e1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        e1.set(2, 222);
        /**
         *
         浅拷贝：拷贝实例和原始实例的引用类型引用同一个对象；
         深拷贝：拷贝实例和原始实例的引用类型引用不同对象。
         */
        System.out.println(e2.get(2)); // 2
    }
}
