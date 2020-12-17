package net.codeshow.abstractFactory.pizzaStore.order

import net.codeshow.abstractFactory.pizzaStore.pizza.{BJCheesePizza, BJPepperPizza, Pizza}

//这是一个实现了AbsFactory的子工厂
//如果希望订购北京的Pizza就使用该工厂子类
class BJFactory extends AbsFactory {
  override def createPizza(t: String): Pizza = {
    var pizza: Pizza = null
    if (t.equals("cheese")) {
      pizza = new BJCheesePizza
    } else if (t.equals("pepper")) {
      pizza = new BJPepperPizza
    }
    pizza
  }
}
