package net.codeshow.abstractFactory.pizzaStore.pizza

class CheesePizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "奶酪披萨"
    println(this.name + " preparing...")
  }
}
