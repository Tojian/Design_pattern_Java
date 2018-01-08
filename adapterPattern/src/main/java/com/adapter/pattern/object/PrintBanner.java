package com.adapter.pattern.object;

/**
 * @Description:
 * @Author: taojian
 * @time : 21:36 2018/1/7
 */
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String string) {

        this.banner = new Banner(string);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
