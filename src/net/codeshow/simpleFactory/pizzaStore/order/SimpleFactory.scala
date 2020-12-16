package net.codeshow.simpleFactory.pizzaStore.order

import net.codeshow.simpleFactory.pizzaStore.pizza.{CheesePizza, GreekPizza, PepperPizza, Pizza}

object SimpleFactory {

  //提供了一个创建pizza的方法，需要创建Pizza调用该方法即可
  def createPizza(t: String): Pizza = {
    var pizza: Pizza = null
    if (t.equals("greek")) {
      pizza = new GreekPizza
    } else if (t.equals("pepper")) {
      pizza = new PepperPizza
    } else if (t.equals("cheese")) {
      pizza = new CheesePizza
    }
    pizza

  }

}
