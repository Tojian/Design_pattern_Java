/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.bridge.pattern;

/**
 * @description:
 * @author: taojian
 * @create: 2018-08-23 10:02
 **/
public class Display {

   private  DisplayImpl display;

   public Display(DisplayImpl display){
       this.display = display;
   }

   public void open(){
       display.rawOpen();
   }

   public void print(){
       display.rawprint();

   }

   public void close(){
       display.rawClose();
   }


   public final void display(){
       open();
       print();
       close();


   }}
