package com.adapter.pattern.object;

/**
 * @Description:
 * @Author: taojian
 * @time : 21:32 2018/1/7
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }
    public void showWithParen(){
        System.out.println("(" + string + ")");
    }

    public void showWithAster(){
        System.out.println("*" + string + "*");
    }

}
