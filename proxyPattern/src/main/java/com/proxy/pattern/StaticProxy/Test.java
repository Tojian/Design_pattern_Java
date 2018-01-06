package com.proxy.pattern.StaticProxy;

/**
 * Created by taojian on 2018/1/6 0006  下午 9:28.
 */
public class Test {

    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
