/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */

package com.decorator.pattern;

/**
 * @Description:
 * @Author: taojian
 * @time : 16:33 2018/1/8
 */
public class SideBorder extends Border {

    private char borderchar;
    public SideBorder(Display display ,char ch) {
        super(display);
        this.borderchar = ch ;
    }

    public int getColumns() {
        return 1 + display.getColumns() +1;
    }

    public int getRows() {
        return display.getRows();
    }

    public String getRowText(int row) {
        return "borderChar" + display.getRowText(row) + "borderChar";
    }
}
