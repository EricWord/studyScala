package net.codeshow.factoryMethod.pizzaStore.order

import net.codeshow.factoryMethod.pizzaStore.pizza.{BJCheesePizza, BJPepperPizza, Pizza}

class BJOrderPizza extends OrderPizza {
  override def createPizza(t: String): Pizza = {
    println("使用的是工厂方法模式")
    var pizza: Pizza = null
    if (t.equals("cheese")) {
      pizza = new BJCheesePizza
    } else if (t.equals("pepper")) {
      pizza = new BJPepperPizza
    }
    pizza
  }
}
