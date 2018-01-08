/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */

package com.decorator.pattern;

/**
 * @Description:
 * @Author: taojian
 * @time : 16:36 2018/1/8
 */
public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }

    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    public String getRowText(int row) {
        if (row == 0) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            return "+" + makeLine('-', display.getColumns()) + "+";
        }
    }

    private String makeLine(char ch, int count) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append(ch);
        }
        return buffer.toString();
    }
}
