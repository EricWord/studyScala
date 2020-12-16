package net.codeshow.simpleFactory.pizzaStore.pizza

class PepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "胡椒披萨"
    println(this.name + " preparing...")
  }
}
