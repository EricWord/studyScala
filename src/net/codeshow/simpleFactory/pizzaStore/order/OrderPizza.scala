package net.codeshow.simpleFactory.pizzaStore.order

import net.codeshow.simpleFactory.pizzaStore.pizza.{GreekPizza, PepperPizza, Pizza}

import scala.io.StdIn
import util.control.Breaks._

class OrderPizza {
  var orderType: String = _
  var pizza: Pizza = _
  breakable {
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
      pizza = SimpleFactory.createPizza(orderType)
      if (pizza == null) {
        break()
      }
      this.pizza.prepare()
      this.pizza.bake()
      this.pizza.cut()
      this.pizza.box()
    } while (true)

  }


}
