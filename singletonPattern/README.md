# Singleton Pattern 单例模式
## 单件：

> 独一无二，他是利用单件模式构造出来的，这个模式让让他在任何时刻都是只有一个对象，比如：如果注册表设置的对象，不想这样的对象有多个拷贝，就可以用单例模式，确保程序中使用的全局资源只有一份。

> 常常被用来管理共享资源，例如数据连接或者线程池

#### 单例类拥有以下几个要素：

* 私有构造方法(保证客户端无法去实例化该对象)
* 指向自己实例的私有静态引用
* 以自己实例为返回值得静态的共有的方法
#### 单例模式分类

A、懒汉单例模式：在第一次调用的时候实例化本身，在并发环境下，可能出现多个本身对象。所以线程是不安全的

B、饿汉单例模式：在类初始化时，已经自行实例化一个静态对象，所以本身就是线程安全的

C、登记单例模式：通过一个专门的类对各单例模式的单一实例进行管理和维护

# 图解

<div align="center"> <img src="../images//static.png" width=""/> </div><br>
>
说明 ： uml 图示 </p>
公共可见性（Public Visibility） +</p>
保护可见性（Protected Visibility） # </p>
私有可见性（Private Visibility） -</p>

#### 详细说明 （推荐饿汉式）
1.如果getInstance()的性能对应用程序不是很关键，就什么都别做</p>
2.使用急切创建实例，而不是用延迟实例化的方法。这种方式也叫做饿汉式的单例模式

```
1. public class SingletonTest2 {
  2. 	//在静态初始化器中创建单例，这段代码保证了线程安全
  3. 	private static SingletonTest2 uniqueInstance=new SingletonTest2();
  4. 	 //这里吧构造器申明为私有的，只有自Singleton类内才可以调用构造器
  5.     private SingletonTest2(){}
  6.     //用getInstance方法实例化对象，并返回这个实例
  7.     public static SingletonTest2 getInstance(){
  8.        //已经有了实例了，直接使用它。
  9.         return uniqueInstance;
  10.     }
  11. }
```

3.用"双重检查加锁"，首先检查是否实例已经创建，如果尚未创建，才进行同步，这里一来，只有第一次同步，这正是我们想要的。

```
1. public class SingletonTest3 {
  2. 	//在静态初始化器中创建单例，这段代码保证了线程安全
  3. 	private volatile static SingletonTest3 uniqueInstance;
  4. 	 //这里吧构造器申明为私有的，只有自Singleton类内才可以调用构造器
  5.     private SingletonTest3(){}
  6.     //用getInstance方法实例化对象，并返回这个实例
  7.     public static SingletonTest3 getInstance(){
  8.     	if(uniqueInstance==null){
  9.     		synchronized (SingletonTest3.class){
  10.     	 if(uniqueInstance ==null){
  11.              uniqueInstance=new SingletonTest3();
  12.          }}}
  13.        //已经有了实例了，直接使用它。
  14.         return uniqueInstance;
  15.     }
  16. }
```

4.类加载的方式：延迟加载，线程安全，同步情况下效率高，不要进行同步控制，实现简单，不能防止反序列化
  
```
1. package designpattern.signleton;
  2. /**
      单例模式，类加载方式
  8.  */
  9. public class SingletonTest4 {
  10. 	
  11. 	 //这里吧构造器申明为私有的，只有自Singleton类内才可以调用构造器
  12.     private SingletonTest4(){}
  13.    
  14.     //静态内部类，用于持有唯一的SingletonClass的实例
  15.     private static class OnlyInstance{
  16.     	static private SingletonTest4 ONLY=new SingletonTest4();
  17.     }
  18.     
  19.     public static SingletonTest4 getInstance(){
  20.     	return OnlyInstance.ONLY;
  21.     }
  22. }
```

5.枚举方式：立即加载，线程安全，实现简单，防止反序列化。
 
```
1. public enum SingletonTest5 {
  2. 	
  3. 	INSRANCE;
  4. 	public void f(){
  5. 	}
  6. }
```
#### 包访问权限

public：可以被所有其他类所访问

private：只能被自己访问和修改

protected：自身、子类及同一个包中类可以访问

default：同一包中的类可以访问，声明时没有加修饰符，认为是friendly。

## Jdk 1.8 源码分析

### java.lang.Runtime#getRuntime 采用的是饿汉式的方式。

```java
public class Runtime {
    private static Runtime currentRuntime = new Runtime();

    /**
     * Returns the runtime object associated with the current Java application.
     * Most of the methods of class <code>Runtime</code> are instance
     * methods and must be invoked with respect to the current runtime object.
     *
     * @return  the <code>Runtime</code> object associated with the current
     *          Java application.
     */
    public static Runtime getRuntime() {
        return currentRuntime;
    }

    /** Don't let anyone else instantiate this class */
    private Runtime() {}

```
### java.awt.Desktop#getDesktop()

```java
  /**
     * Returns the <code>Desktop</code> instance of the current
     * browser context.  On some platforms the Desktop API may not be
     * supported; use the {@link #isDesktopSupported} method to
     * determine if the current desktop is supported.
     * @return the Desktop instance of the current browser context
     * @throws HeadlessException if {@link
     * GraphicsEnvironment#isHeadless()} returns {@code true}
     * @throws UnsupportedOperationException if this class is not
     * supported on the current platform
     * @see #isDesktopSupported()
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
    public static synchronized Desktop getDesktop(){
        if (GraphicsEnvironment.isHeadless()) throw new HeadlessException();
        if (!Desktop.isDesktopSupported()) {
            throw new UnsupportedOperationException("Desktop API is not " +
                                                    "supported on the current platform");
        }

        sun.awt.AppContext context = sun.awt.AppContext.getAppContext();
        Desktop desktop = (Desktop)context.get(Desktop.class);

        if (desktop == null) {
            desktop = new Desktop();
            context.put(Desktop.class, desktop);
        }

        return desktop;
    }
```

### java.lang.System#getSecurityManager() 
```java


    /* The security manager for the system.
     */
    private static volatile SecurityManager security = null;


    /**
     * Gets the system security interface.
     *
     * @return  if a security manager has already been established for the
     *          current application, then that security manager is returned;
     *          otherwise, <code>null</code> is returned.
     * @see     #setSecurityManager
     */
    public static SecurityManager getSecurityManager() {
        return security;
    }
    
```
 
 