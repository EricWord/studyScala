package net.codeshow.factoryMethod.pizzaStore.pizza

class GreekPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "希腊披萨"
    println(this.name + " preparing...")
  }
}
