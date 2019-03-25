/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @description: number
 * @author: taojian
 * @create: 2018-06-02 15:50
 **/
public abstract  class NumberGenerator {

    private ArrayList obeservers = new ArrayList();

    public void addObeserver(Observer observer){
        obeservers.add(observer);
    }

    public void removeObeserver(Observer observer){
        obeservers.remove(observer);
    }


    public void notifyObeserver(){

        Iterator iterator = obeservers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(this);
        }

    }

    public abstract int getNumber();

    public abstract void execute();
}
