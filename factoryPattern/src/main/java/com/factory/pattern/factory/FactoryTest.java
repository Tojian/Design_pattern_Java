package com.factory.pattern.factory;

import com.factory.pattern.simplefactory.MailSend;
import com.factory.pattern.simplefactory.Send;

/**
 * Created by taojian on 2018/1/7 0007  上午 10:21.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Send send = provider.produce();
        send.send();

    }
}
