package com.singleton.pattern;
/**
 * 
 * @author taojian
 * @ClassName SingletonTest.java
 * @description  单例模式，使用双重加锁，在getInstance中减少使用同步
 */
public class SingletonTest3 {
	//在静态初始化器中创建单例，这段代码保证了线程安全
	private volatile static SingletonTest3 uniqueInstance;
	 //这里吧构造器申明为私有的，只有自Singleton类内才可以调用构造器
    private SingletonTest3(){}
    //用getInstance方法实例化对象，并返回这个实例
    public static SingletonTest3 getInstance(){
    	if(uniqueInstance==null){
    		synchronized (SingletonTest3.class){
    	 if(uniqueInstance ==null){
             uniqueInstance=new SingletonTest3();
         }}}
       //已经有了实例了，直接使用它。
        return uniqueInstance;
    }
}


