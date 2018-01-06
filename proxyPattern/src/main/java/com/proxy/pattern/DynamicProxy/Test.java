package com.proxy.pattern.DynamicProxy;

/**
 * Created by taojian on 2018/1/6 0006  下午 9:28.
 */
public class Test {

    public static void main(String[] args) {
        Rent host = new Host();
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler();
        // Host proxy = (Host) dynamicProxyHandler.getProxy();
        //绑定代理对象。
         host= (Rent) dynamicProxyHandler.getProxy(host);
        //这里service经过绑定，就会进入invoke方法里面了。
        System.out.println(host);
         host.rent();
    }
}
