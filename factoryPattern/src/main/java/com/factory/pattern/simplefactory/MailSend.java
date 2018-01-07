package com.factory.pattern.simplefactory;

/**
 * Created by taojian on 2018/1/7 0007  上午 10:00.
 */
public class MailSend implements Send {
    @Override
    public void send() {
        System.out.println("MainSend send ");
    }
}
