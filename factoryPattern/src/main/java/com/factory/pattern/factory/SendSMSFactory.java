package com.factory.pattern.factory;

import com.factory.pattern.simplefactory.SMSSend;
import com.factory.pattern.simplefactory.Send;

/**
 * Created by taojian on 2018/1/7 0007  上午 9:57.
 */
public class SendSMSFactory implements Provider {
    @Override
    public Send produce() {
        return new SMSSend();
    }
}
