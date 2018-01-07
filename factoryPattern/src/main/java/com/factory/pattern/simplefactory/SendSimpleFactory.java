package com.factory.pattern.simplefactory;

/**
 * Created by taojian on 2018/1/7 0007  上午 10:03.
 */
public class SendSimpleFactory {
    /**
     * @ClassName SendSimpleFactory.java
     * @description 简单工厂类
     */
    public Send produce(String type) {
        Send send = null;
        if ("mail".equals(type)) {
            send = new MailSend();
        } else if ("sms".equals(type)) {
            send = new SMSSend();
        } else {
            System.out.println("输入有问题");
        }
        return send;
    }

    /**
     *  防止上面的方法传入参数的问题，导致实例化出错。
     * @return
     */
    public Send produceMail() {
        return new MailSend();
    }

    public Send produceSMS() {
        return new SMSSend();
    }

}

