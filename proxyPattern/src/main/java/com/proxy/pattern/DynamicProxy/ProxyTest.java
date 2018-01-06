package com.proxy.pattern.DynamicProxy;

import com.proxy.pattern.Util.ProxyGeneratorUtils;

/**
 * Created by taojian on 2018/1/6 0006  下午 10:49.
 */
public class ProxyTest {

    public static void main(String[] args) {
       /* HelloServiceProxy proxy = new HelloServiceProxy();
        HelloService service = new HelloServiceImpl();
        //绑定代理对象。
        service = (HelloService) proxy.bind(service, new Class[] {HelloService.class});
        //这里service经过绑定，就会进入invoke方法里面了。
        service.sayHello("张三");*/
        testGenerateProxyClass();
    }

    public static void testGenerateProxyClass() {
        ProxyGeneratorUtils.writeProxyClassToHardDisk("E:/$Proxy11.class");
    }
}
