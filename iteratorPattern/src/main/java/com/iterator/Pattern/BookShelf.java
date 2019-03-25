/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.iterator.Pattern;

/**
 * @description: 书架
 * @author: taojian
 * @create: 2018-08-14 15:51
 *
 **/
public class BookShelf implements Aggregate {

    private Book[] books;
    // 指向最后一个元素
    private int last = 0;

    public BookShelf(int maxsize) {
        books = new Book[maxsize];
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getlength() {
        return last;
    }

}
