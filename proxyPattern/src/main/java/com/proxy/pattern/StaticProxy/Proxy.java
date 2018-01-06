package com.proxy.pattern.StaticProxy;

/**
 * Created by taojian on 2018/1/6 0006  下午 9:24.
 */
public class Proxy implements Rent {
    //这个是房东，这种方式就是代理模式，对类进行复用
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    //租房
    public void rent() {
        seeHouse();
        //调用房主的rent的方法
        host.rent();
        fare();
    }

    //看房
    private void seeHouse() {
        System.out.println("带房客看房");
    }

    //收中介费
    private void fare() {
        System.out.println("收取中介费");
    }
}
