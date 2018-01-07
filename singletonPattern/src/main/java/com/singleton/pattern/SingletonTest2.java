package com.singleton.pattern;
/**
 * 
 * @author taojian
 * @ClassName SingletonTest.java
 * @description  单例模式
 */
public class SingletonTest2 {
	//在静态初始化器中创建单例，这段代码保证了线程安全
	private static SingletonTest2 uniqueInstance=new SingletonTest2();
	 //这里吧构造器申明为私有的，只有自Singleton类内才可以调用构造器
    private SingletonTest2(){}
    //用getInstance方法实例化对象，并返回这个实例
    public static SingletonTest2 getInstance(){
       //已经有了实例了，直接使用它。
        return uniqueInstance;
    }
}


