package com.singleton.pattern;
/**
 * 
 * @author taojian
 * @ClassName SingletonTest.java
 * @description  单例模式
 */
public class SingletonTest {
	 //利用一个静态变量来记录Sinleton类的唯一实例
	private static SingletonTest uniqueInstance;
	 //这里吧构造器申明为私有的，只有自Singleton类内才可以调用构造器
    private SingletonTest(){}
    //用getInstance方法实例化对象，并返回这个实例
    public static SingletonTest getInstance(){
        if(uniqueInstance ==null){
            uniqueInstance=new SingletonTest();
        }
        return uniqueInstance;
    }
}


