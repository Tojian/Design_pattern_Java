/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */

import java.util.HashMap;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-14 21:47
 **/
public class Test {

    public static void main(String[] args) {
        HashMap<Integer ,Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(null ,1);
        System.out.println(hashMap.get(null));
    }
}
