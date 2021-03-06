# Factory Pattern  工厂模式
---
### 关键字new
当使用关键字new时，的确是在实例化一个具体类，所以用的确是实现，而不是接口，代码捆绑着具体类会导致代码更脆弱，更缺乏弹性。</p>
在技术上，new没有错，毕竟这是Java的基础部分，真正的犯人是我们的老朋友“改变”，以及它是如何影响new的使用。

针对接口编程，可以隔离掉以后系统可能发生的一大堆改变，如果代码是面对接口编程，那么通过多态，它可以与任何新类实现该接口，但是，当代码使用大量的具体类，等于是自找麻烦，因为一旦加入新的具体类，就必须改变代码，也就是你的代码并非“对修改关闭”。想用新的具体类型来扩展代码，必须重新打开它。

----
下面慢慢去介绍工厂模式：
首先我们引出简单工厂，这个简单工厂不属于模式，更像一种编程习惯。


简单工厂：简单工厂模式不属于23中涉及模式，简单工厂一般分为：普通简单工厂、多方法简单工厂、静态方法简单工厂。

----

## 简单工厂模式

  简单工厂模式中包含的角色及其相应的职责如下：</p>
  
* 工厂角色（Creator）：这是简单工厂模式的核心，由它负责创建所有的类的内部逻辑。当然工厂类必须能够被外界调用，创建所需要的产品对象。

*  抽象（Product）产品角色：简单工厂模式所创建的所有对象的父类，注意，这里的父类可以是接口也可以是抽象类，它负责描述所有实例所共有的公共接口。

* 具体产品（Concrete Product）角色：简单工厂所创建的具体实例对象，这些具体的产品往往都拥有共同的父类。



简单工厂模式深入分析：</p>
       简单工厂模式解决的问题是如何去实例化一个合适的对象。</p>
       简单工厂模式的核心思想就是：有一个专门的类来负责创建实例的过程。</p>
       具体来说，把产品看着是一系列的类的集合，这些类是由某个抽象类或者接口派生出来的一个对象树。而工厂类用来产生一个合适的对象来满足客户的要求。</p>
       如果简单工厂模式所涉及到的具体产品之间没有共同的逻辑，那么我们就可以使用接口来扮演抽象产品的角色；如果具体产品之间有功能的逻辑或，我们就必须把这些共同的东西提取出来，放在一个抽象类中，然后让具体产品继承抽象类。为实现更好复用的目的，共同的东西总是应该抽象出来的。</p>
       在实际的的使用中，抽闲产品和具体产品之间往往是多层次的产品结构，如下图所示：</p>


举例说明：邮件发送和短信发送方式</p>
第一步：建立发送的抽象产品

```
1. package designpattern.factorysimple;
  2. /**
  3.  * 
  4.  * @ClassName Send.java
  5.  * @description 定义一个接口 ，也就是一个抽象产品
  6.  */
  7. public interface Send {
  8. 	//接口方法发送信息
  9. 	public void send();
  10. }
```


第二步：分别建立邮件和短信的发送，当然要实现抽象产品，这里的邮件和短信发送就是具体产品
 
```
1. package designpattern.factorysimple;
  2. /**
  3.  * 
  4.  * @ClassName MailSend.java
  5.  * @description 创建一个邮箱发送消息类，实现了抽象产品的方法
  6.  */
  7. public class MailSend implements Send {
  8. 	@Override
  9. 	public void send() {
  10. 		System.out.println("这个是邮箱发送");
  11. 	}
  12. }
  1. package designpattern.factorysimple;
  2. /**
  3.  * @ClassName SMSend.java
  4.  * @description 短信发送，也是实现了抽象产品类Send.java
  5.  */
  6. public class SMSend  implements Send{
  7. 	@Override
  8. 	public void send() {
  9. 		System.out.println("这是短信发送");
  10. 	}
  11. }
```

第三步：建立简单工厂
 
```
1. package designpattern.factorysimple;
  2. /**
  3.  * 
  4.  * @ClassName SendSimpleFactory.java
  5.  * @description 简单工厂类
  6.  */
  7. public class SendSimpleFactory {
  8. 	public Send produce(String type){
  9. 		Send send=null;
  10. 		if("mail".equals(type)){
  11. 			send=new  MailSend();
  12. 		}else if("sms".equals(type)){
  13. 			send=new SMSend();
  14. 		}else{
  15. 			System.out.println("输入有问题");
  16. 		}
  17. 		return send;
  18. 	}
  19. 	
  20. 	
  21. }
```

第四步：进行测试：


```
1. package designpattern.factorysimple;
  2. public class FactoryTest {
  3. 	public static void main(String[] args) {
  4. 		SendSimpleFactory ssf=new SendSimpleFactory();
  5. 		Send send=ssf.produce("sms");
  6. 		send.send();
  7. 	}
  8. }
```


当然我们可以进行修改，可以在工厂当中建立多个方法，这个对普通工厂模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式提供多个工厂方法，分别创建对象。

 
```
1. 	public Send produceMail(){
  2. 		return new MailSend();
  3. 	}
  4. 	public Send produceSMS(){
  5. 		return new SMSend();
  6. 	}
  7.
```
  有时候我们会看到把工厂定义成一个静态的方法，利用静态方法定义个简单的工厂，这是很常见的技巧，常被称为静态工厂，为何使用静态方法？因为不需要使用创建对象的方法来实例化对象，但请记住，这也有缺点，不能通过继承来改变创建方法的行为。</p>
  
总体来说，工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。在以上的三种模式中，第一种如果传入的字符串有误，不能正确创建对象，第三种相对于第二种，不需要实例化工厂类，所以，大多数情况下，我们会选用第三种——静态工厂方法模式。

-----

## 工厂方法模式

简单工厂模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，有一定的问题，如何解决？就用到工厂方法模式，创建一个工厂接口和创建多个工厂实现类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。

### 定义
工厂方法模式又称为工厂模式，也叫虚拟构造器（Virtual Constructor）模式或者多态工厂模式（Polymorphic Factory），在工厂方法模式中，父类负责定义创建对象的公共接口，而子类则负责生成具体的对象，这样做的目的是将类的实例化操作延迟到子类中完成，即由子类来决定究竟应该实例化（创建）哪一个类。</p>
工厂方式法模式（Factory Method），定义了一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到子类。

### 图解
<div align="center"> <img src="../images//factory.png" width=""/> </div><br>

###意图

定义一个用户创建对象的接口，让子类决定实例化哪一个类，工厂方法模式使一个类的实例化延迟到其子类。

###  参与者
* 抽象产品角色（Product）：定义产品的接口
* 具体产品角色（ConcreteProduct） ：实现接口Product的具体产品类
* 抽象工厂角色（Creator） ：声明工厂方法（FactoryMethod），返回一个产品
* 真实的工厂（ConcreteCreator）：实现FactoryMethod工厂方法，由客户调用，返回一个产品的实例

现在我们来改写：
第一步：增加接口

```
1. package designpattern.factorysimple;
  2. //提供一个接口
  3. public interface Provider {
  4. 	public Send produce();
  5. }
```

第二步：给短信和邮箱分别增加工厂

```
1. package designpattern.factorysimple;
  2. /**
  3.  * 
  4.   @ClassName SendMailFactory.java
  5.  * @description 这个是发送邮件的工厂
  6.  */
  7. public class SendMailFactory implements Provider{
  8. 	@Override
  9. 	public Send produce() {
  10. 		// TODO Auto-generated method stub
  11. 		return new MailSend();
  12. 	}
  13. }
```
```
  1. package designpattern.factorysimple;
  2. /**
  3.  * 
  4.  * @ClassName SendSMSFactory.java
  5.  * @description
  6.  */
  7. public class SendSMSFactory implements Provider {
  8. 	@Override
  9. 	public Send produce() {
  10. 		// TODO Auto-generated method stub
  11. 		return new SMSend();
  12. 	}
  13. }
```
第三步：进行测试：
  
```
1. 	
  2. 		Provider provider=new SendMailFactory();
  3. 		Send send=provider.produce();
  4. 		send.send();
  5. 	}
```
其实这个模式的好处就是，如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！

## 抽象工厂模式
### 说明
----

就是对一组具有相同主题的工厂进行封装（维基百科)</p>
例如：生产一台PC机，使用工厂方法模式的话，一般会有cpu工厂，内存工厂，显卡工厂...但是使用抽象工厂模式的话，只有一个工厂就是PC工厂，但是一个PC工厂涵盖了cpu工厂，内存工厂，显卡工厂等要做的所有事；

----


 抽象工厂模式是工厂方法模式的升级版本，他用来创建一组相关或者相互依赖的对象。他与工厂方法模式的区别就在于，工厂方法模式针对的是一个产品等级结构；而抽象工厂模式则是针对的多个产品等级结构。在编程中，通常一个产品结构，表现为一个接口或者抽象类，也就是说，工厂方法模式提供的所有产品都是衍生自同一个接口或抽象类，而抽象工厂模式所提供的产品则是衍生自不同的接口或抽象类。
        在抽象工厂模式中，有一个产品族的概念：所谓的产品族，是指位于不同产品等级结构中功能相关联的产品组成的家族。抽象工厂模式所提供的一系列产品就组成一个产品族；而工厂方法提供的一系列产品称为一个等级结构。我们依然拿生产汽车的例子来说明他们之间的区别。
        
### 图示

<div align="center"> <img src="../images//abstractFactory.png" width=""/> </div><br>

###抽象工厂模式的优点

> 抽象工厂模式除了具有工厂方法模式的优点外，最主要的优点就是可以在类的内部对产品族进行约束。所谓的产品族，一般或多或少的都存在一定的关联，抽象工厂模式就可以在类内部对产品族的关联关系进行定义和描述，而不必专门引入一个新的类来进行管理。
 
### 抽象工厂模式的缺点

> 产品族的扩展将是一件十分费力的事情，假如产品族中需要增加一个新的产品，则几乎所有的工厂类都需要进行修改。所以使用抽象工厂模式时，对产品等级结构的划分是非常重要的。
 
### 适用场景

> 当需要创建的对象是一系列相互关联或相互依赖的产品族时，便可以使用抽象工厂模式。说的更明白一点，就是一个继承体系中，如果存在着多个等级结构（即存在着多个抽象类），并且分属各个等级结构中的实现类之间存在着一定的关联或者约束，就可以使用抽象工厂模式。假如各个等级结构中的实现类之间不存在关联或约束，则使用多个独立的工厂来对产品进行创建，则更合适一点。
 
## 总结

> 无论是简单工厂模式，工厂方法模式，还是抽象工厂模式，他们都属于工厂模式，在形式和特点上也是极为相似的，他们的最终目的都是为了解耦。在使用时，我们不必去在意这个模式到底工厂方法模式还是抽象工厂模式，因为他们之间的演变常常是令人琢磨不透的。经常你会发现，明明使用的工厂方法模式，当新需求来临，稍加修改，加入了一个新方法后，由于类中的产品构成了不同等级结构中的产品族，它就变成抽象工厂模式了；而对于抽象工厂模式，当减少一个方法使的提供的产品不再构成产品族之后，它就演变成了工厂方法模式。
       所以，在使用工厂模式时，只需要关心降低耦合度的目的是否达到了。