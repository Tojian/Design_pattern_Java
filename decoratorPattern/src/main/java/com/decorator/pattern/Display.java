/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */

package com.decorator.pattern;

/**
 * @Description:
 * @Author: taojian
 * @time : 16:06 2018/1/8
 */
public abstract  class Display {

    public abstract int getColumns();

    public  abstract int getRows();

    public  abstract String getRowText(int row);

    public final void show(){
        for(int i = 0 ; i< getRows() ; i++){
            System.out.println(getRowText(i));
        }
    }
}
