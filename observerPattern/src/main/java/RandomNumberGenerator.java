/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */

import java.util.Random;

/**
 * @description: random
 * @author: taojian
 * @create: 2018-06-02 15:59
 **/
public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();

    private int number;
    public int getNumber() {
        return number;
    }

    public void execute() {

        for ( int i = 0; i < 20; i++){
            number = random.nextInt(50);
            notifyObeserver();
        }
    }
}
