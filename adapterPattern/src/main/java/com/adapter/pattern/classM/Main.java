
package com.adapter.pattern.classM;

/**
 * @Description:
 * @Author: taojian
 * @time : 21:38 2018/1/7
 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("hello") ;
        print.printStrong();
        print.printWeak();
    }
}
