package net.codeshow.abstractFactory.pizzaStore.order

object PizzaStore {
  def main(args: Array[String]): Unit = {
    new OrderPizza(new BJFactory)
  }

}