# Design_pattern_Java
# 代理模式：控制对象访问
* 在headfirst的上面有一个很好例子：你是一个白脸，提供很好且很友善的服务，但是你不希望每个人都叫你做事，所以找了黑脸控制对你的访问。</p> 
*  这就是代理要做的：控制和管理访问。就像你将看到的，代理的方式有很多种。代理以通过Internet为它们的代理对象搬运的整个方法调用而出名，它以可以代替某些懒惰的对象做一些事情。</p>
* 官方定义：代理模式为另一个对象提供一个替身或占位符以控制这个对象的访问。使用代理模式创建代表对象，让代表对象控制某对象的访问，被代理的对象可以是远程的对象、创建开销大的对象或需要安全控制的对象。
## 静态代理：
 1.静态代理模式的角色分析：</p>
抽象角色--一般使用接口或者抽象类来实现</p>
真实角色--被代理的角色</p>
代理角色--代理真实角色一般代理真实角色后一般会做一些附属操作。</p>
客户------使用代理角色来进行一些操作</p>



 下面以房屋租房来说明一些静态代理模式，这里主要有三个角色：房东，中介，租房者。中介就相当于代理，代理房东的一些权利，这样房东就会减少很多麻烦。安静的收钱就可以。接下来用程序说明一下：</p>
第一步：建立租房的公用的接口
 
```
1. public interface Rent {
  2. 	public void rent();
  3. }
```


第二步：建立房东的类，hust.java，房东的类并实现租房的公用接口
 
```
1. public class Host implements Rent{
  2. 	//房东的类里面有一个方法，可以进行房屋的出租
  3. 	public void rent(){
  4. 		System.out.println("房屋出租");
  5. 	}
  6. }
```

第三步：建立中介的类，也就是代理类，也实现了公用的接口

```
1. public class Proxy implements Rent{
  2. 	//这个是房东，这种方式就是代理模式，对类进行复用
  3. 	private Host host;
  4. 	public Proxy() {
  5. 	}
  6. 	public Proxy(Host host) {
  7. 		this.host = host;
  8. 	}
  9. 	public void setHost(Host host) {
  10. 		this.host = host;
  11. 	}
  12. 	//租房
  13. 	public void rent(){
  14. 		seeHouse();
  15. 		//调用房主的rent的方法
  16. 		host.rent();
  17. 		fare();
  18. 	}
  19. 	//看房
  20. 	private void seeHouse(){
  21. 		System.out.println("带房客看房");
  22. 	}
  23. 	//收中介费
  24. 	private void fare(){
  25. 		System.out.println("收取中介费");
  26. 	}
  27. }
```

第四步：建立租房者的类，也就是客户类：

```
1. public class Client {
  2. 	public static void main(String[] args) {
  3. 		Host host = new Host();
  4. 		Proxy proxy = new Proxy(host);
  5. 		proxy.rent();
  6. 	}
  7. }
```

第五步：运行结果：
  1. 带房客看房
  2. 房屋出租
  3. 收取中介费

好处：使得真实的角色处理的业务更加纯粹，不再去关注一些公共的事情。公共的业务由代理来完成------实现了业务的分工
公共的业务发生扩展时变得更加集中和方便
缺点：类多了---多了代理类，工作量就会变大。开发效率降低了

## 动态代理：
动态代理和静态代理的角色是一样的。
动态代理类是自动生成的。
分为两类：一类基于接口的动态代理
一类是基于类的动态代理

基于接口的动态代理---jdk的动态代理
基于类的动态代理---cglib
现在用的比较多的是javasist来生成动态代理类。

jdk的动态代理  ---proxy类和InvocationHandler接口</p>

```
public interface InvocationHandler
```
InvocationHandler 是代理实例的调用处理程序 实现的接口。
每个代理实例都具有一个关联的调用处理程序。对代理实例调用方法时，将对方法调用进行编码并将其指派到它的调用处理程序的 invoke 方法。

```
Object invoke(Object proxy,  Method method,  Object[] args)   throws Throwable
```

在代理实例上处理方法调用并返回结果。在与方法关联的代理实例上调用方法时，将在调用处理程序上调用此方法。
> 参数:
 1. proxy - 在其上调用方法的代理实例
2.  method - 对应于在代理实例上调用的接口方法的 Method 实例。Method 对象的声明类将是在其中声明方法的接口，该接口可以是代理类赖以继承方法的代理接口的超接口。
3. args - 包含传入代理实例上方法调用的参数值的对象数组，如果接口方法不使用参数，则为 null。基本类型的参数被包装在适当基本包装器类（如 java.lang.Integer 或java.lang.Boolean）的实例中。
> 返回：
1. 从代理实例的方法调用返回的值。如果接口方法的声明返回类型是基本类型，则此方法返回的值一定是相应基本包装对象类的实例；否则，它一定是可分配到声明返回类型的类型。如果此方法返回的值为 null 并且接口方法的返回类型是基本类型，则代理实例上的方法调用将抛出 NullPointerException。否则，如果此方法返回的值与上述接口方法的声明返回类型不兼容，则代理实例上的方法调用将抛出 ClassCastException。
> 抛出：
1. Throwable - 从代理实例上的方法调用抛出的异常。该异常的类型必须可以分配到在接口方法的 throws 子句中声明的任一异常类型或未经检查的异常类型 java.lang.RuntimeException 或java.lang.Error。如果此方法抛出经过检查的异常，该异常不可分配到在接口方法的 throws 子句中声明的任一异常类型，代理实例的方法调用将抛出包含此方法曾抛出的异常的UndeclaredThrowableException。

```
public class Proxy extends Object  implements Serializable
```
Proxy 提供用于创建动态代理类和实例的静态方法，它还是由这些方法创建的所有动态代理类的超类。

```
newProxyInstance  public static Object newProxyInstance(ClassLoader loader,  Class<?>[] interfaces, InvocationHandler h)  throws IllegalArgumentException
```

返回一个指定接口的代理类实例，该接口可以将方法调用指派到指定的调用处理程序。此方法相当于： 
```
Proxy.getProxyClass(loader, interfaces). getConstructor(new Class[] { InvocationHandler.class }).  newInstance(new Object[] { handler });
```

Proxy.newProxyInstance 抛出 IllegalArgumentException，原因与 Proxy.getProxyClass 相同。
参数：
loader - 定义代理类的类加载器
interfaces - 代理类要实现的接口列表
h - 指派方法调用的调用处理程序
返回：
一个带有代理类的指定调用处理程序的代理实例，它由指定的类加载器定义，并实现指定的接口
抛出：
IllegalArgumentException - 如果违反传递到 getProxyClass 的参数上的任何限制
NullPointerException - 如果 interfaces 数组参数或其任何元素为 null，或如果调用处理程序 h 为 null
用上面的例子进行改写：
第一步：将上面的host，rent等类不变化
第二步：重写代理类：
 
```
1. import java.lang.reflect.InvocationHandler;
  2. import java.lang.reflect.Method;
  3. import java.lang.reflect.Proxy;
  4. public class ProxyInovationHandler implements InvocationHandler{
  5. 	private Object target;//目标对象--真实对象
  6. 	public void setTarget(Object target) {
  7. 		this.target = target;
  8. 	}
  9. 	/**
  10. 	 * 生成代理类
  11. 	 * */
  12. 	public Object getProxy(){
  13. 		return Proxy.newProxyInstance(this.getClass().getClassLoader(), 
  14. 				target.getClass().getInterfaces(), this);
  15. 	}
  16. 	/**
  17. 	 * proxy是代理类
  18. 	 * method 代理类的调用处理程序的方法对象
  19. 	 * */
  20. 	@Override
  21. 	public Object invoke(Object proxy, Method method, Object[] args)
  22. 			throws Throwable {
  23. 		// System.out.println("args="+args[0]);
  24. 		log(method.getName());
  25. 		Object result = method.invoke(target, args);
  26. 		return result;
  27. 	}
  28. 	public void log(String methodName){
  29. 		System.out.println("执行"+methodName+"方法");
  30. 	}
  31. }
```

一个动态代理可以某一类的业务，一个动态代理可以代理多个类。


