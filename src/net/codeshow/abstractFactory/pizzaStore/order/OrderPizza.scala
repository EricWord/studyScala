package net.codeshow.abstractFactory.pizzaStore.order

import net.codeshow.abstractFactory.pizzaStore
import net.codeshow.abstractFactory.pizzaStore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

//使用抽象工厂模式后，订购一个pizza的思路
//1.接收一个子工厂实例，根据该工厂的创建要求去实例化
class OrderPizza {
  var absFactory: AbsFactory = _

  def this(absFactory: AbsFactory) { //多态
    this
    breakable {
      var orderType: String = null
      var pizza: Pizza = null
      do {
        println("请输入pizza的类型，抽象工厂模式...")
        orderType = StdIn.readLine()
        pizza = absFactory.createPizza(orderType)
        if (pizza == null) {
          break()
        }
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
      } while (true)
    }

  }

}
