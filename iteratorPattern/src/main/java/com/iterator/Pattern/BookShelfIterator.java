/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.iterator.Pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-14 15:51
 **/
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;

    private int index;

    public BookShelfIterator(BookShelf bookShelf) {

        this.bookShelf = bookShelf;
        index = 0;
    }

    public boolean hashNext() {

        if (index < bookShelf.getlength()) {
            return true;
        }
        return false;
    }

    public Object next() {

        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
