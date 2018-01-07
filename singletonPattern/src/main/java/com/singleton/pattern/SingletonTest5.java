package com.singleton.pattern;
/**
 * 
 * @author taojian
 * @ClassName SingletonTest.java
 * @description  单例模式，类加载方式
 */
public class SingletonTest5 {
	
	 //这里吧构造器申明为私有的，只有自Singleton类内才可以调用构造器
    private SingletonTest5(){}
   
    //静态内部类，用于持有唯一的SingletonClass的实例
    private static class OnlyInstance{
    	static private SingletonTest5 ONLY=new SingletonTest5();
    }
    
    public static SingletonTest5 getInstance(){
    	return OnlyInstance.ONLY;
    }
}


