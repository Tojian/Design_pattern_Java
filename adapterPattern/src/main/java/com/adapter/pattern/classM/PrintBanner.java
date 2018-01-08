package com.adapter.pattern.classM;

/**
 * @Description:
 * @Author: taojian
 * @time : 21:36 2018/1/7
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    public void printWeak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
