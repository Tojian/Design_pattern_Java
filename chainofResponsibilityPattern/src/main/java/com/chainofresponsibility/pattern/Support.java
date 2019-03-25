/*
 * Copyright (C) 2018 Taojian, Inc. All Rights Reserved.
 */
package com.chainofresponsibility.pattern;

/**
 * @description: 解决问题的抽象类
 * @author: taojian
 * @create: 2018-08-24 09:26
 **/
public abstract class Support {

    private String name;

    // 用于推卸给的对象
    private Support next;

    public Support(String name){
        this.name = name ;
    }
    public Support setNext(Support next){

        this.next = next;
        return  next;
    }


    public final  void support(Trouble trouble){

        if (resolve(trouble)){
            done(trouble);
        }else if(next != null){
            next.support(trouble);
        }else {
           fail(trouble);
        }
    }


    public String toString(){
        return "[" + name +"]";
    }


    protected  abstract  boolean resolve(Trouble trouble);

    protected  void done(Trouble trouble){
        System.out.println(trouble + " is resolved by" + this + ".");
    }


    protected void fail(Trouble trouble){
        System.out.println(trouble + "can not be resolved");
    }
}
