package net.codeshow.abstractFactory.pizzaStore.pizza

class BJPepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "北京胡椒pizza"
    println(this.name + " preparing...")

  }
}
