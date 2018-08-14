/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.iterator.Pattern;

/**
 * 书架上面方很多书，然后帮它遍历出来
 * @description:
 * @author: taojian
 * @create: 2018-08-14 15:51
 *
 * 遍历和实现分离
 **/
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4 );

        bookShelf.appendBook(new Book("Hello wwwwwwwww"));
        bookShelf.appendBook(new Book("Hello1 wwwwwwwww"));
        bookShelf.appendBook(new Book("Hello2 wwwwwwwww"));
        bookShelf.appendBook(new Book("Hello3 wwwwwwwww"));

        Iterator iterator = bookShelf.iterator();

        while(iterator.hashNext()){
            Book book = (Book)iterator.next();
            System.out.println(book.getName());

        }  }
}
