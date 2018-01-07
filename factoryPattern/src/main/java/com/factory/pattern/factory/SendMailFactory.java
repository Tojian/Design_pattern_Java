package com.factory.pattern.factory;

import com.factory.pattern.simplefactory.MailSend;
import com.factory.pattern.simplefactory.Send;

/**
 * Created by taojian on 2018/1/7 0007  上午 9:56.
 */
public class SendMailFactory implements Provider {
    @Override
    public Send produce() {
        return new MailSend();
    }
}
