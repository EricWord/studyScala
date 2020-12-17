package net.codeshow.abstractFactory.pizzaStore.pizza

class BJCheesePizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "北京奶酪pizza"
    println(this.name + " preparing...")
  }
}
