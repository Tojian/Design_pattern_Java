package com.singleton.pattern;
/**
 * 
 * @author taojian
 * @ClassName SingletonTest.java
 * @description  单例模式，类加载方式
 */
public class SingletonTest4 {
	
	 //这里吧构造器申明为私有的，只有自Singleton类内才可以调用构造器
    private SingletonTest4(){}
   
    //静态内部类，用于持有唯一的SingletonClass的实例
    private static class OnlyInstance{
    	static private SingletonTest4 ONLY=new SingletonTest4();
    }
    
    public static SingletonTest4 getInstance(){
    	return OnlyInstance.ONLY;
    }
}


