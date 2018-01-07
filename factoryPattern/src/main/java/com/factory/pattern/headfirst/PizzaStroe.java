package com.factory.pattern.headfirst;

public class PizzaStroe {
   SimplePizzaFactory factory;
   public PizzaStroe(SimplePizzaFactory factory) {

	   this.factory=factory;
   }
   public Pizza orderPizza(String type){
	   Pizza pizza;
	   pizza=factory.createPizza(type);
	   return pizza;
	   
	   
	   
   }

}
