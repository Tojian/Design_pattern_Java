package com.factory.pattern.simplefactory;

/**
 * Created by taojian on 2018/1/7 0007  上午 10:05.
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SendSimpleFactory sendSimpleFactory = new SendSimpleFactory();
        Send send = sendSimpleFactory.produce("mail");
        send.send();
    }
}
