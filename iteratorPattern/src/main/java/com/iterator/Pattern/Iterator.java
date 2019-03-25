/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.iterator.Pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-14 15:51
 **/
public interface Iterator<T> {

    public boolean hashNext();

    public T next();

}
