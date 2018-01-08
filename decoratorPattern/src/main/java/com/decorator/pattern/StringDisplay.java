/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */

package com.decorator.pattern;

/**
 * @Description:
 * @Author: taojian
 * @time : 16:09 2018/1/8
 */
public class StringDisplay extends Display {

    private String string ;

    public StringDisplay(String string) {
        this.string = string;
    }

    public int getColumns() {
        return string.getBytes().length;
    }

    public int getRows() {
        return 1;
    }

    public String getRowText(int row) {
        if ( row == 0){
            return  string;
        }
          return null;
    }
}
