package net.codeshow.abstractFactory.pizzaStore.order

import net.codeshow.abstractFactory.pizzaStore.pizza.Pizza

trait AbsFactory {
  //抽象方法
  def createPizza(t: String): Pizza

}
