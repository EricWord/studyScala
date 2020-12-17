package net.codeshow.factoryMethod.pizzaStore.order

import net.codeshow.factoryMethod.pizzaStore.pizza
import net.codeshow.factoryMethod.pizzaStore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

abstract class OrderPizza {
  breakable {
    var orderType: String = null
    var pizza: Pizza = null

    do {
      println("请输入Pizza类型")
      orderType = StdIn.readLine()
      //      if (orderType.equals("greek")) {
      //        //创建希腊pizza
      //        this.pizza = new GreekPizza
      //      } else if (orderType.equals("pepper")) {
      //        //创建胡椒pizza
      //        this.pizza = new PepperPizza
      //      } else {
      //        break()
      //      }
      pizza = createPizza(orderType)
      if (pizza == null) {
        break()
      }
      pizza.prepare()
      pizza.bake()
      pizza.cut()
      pizza.box()
    } while (true)

  }

  //抽象的方法，让各个子类去实现
  def createPizza(t: String): Pizza

}
