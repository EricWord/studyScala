package net.codeshow.constructor

import scala.beans.BeanProperty


object BeanDemo {
  def main(args: Array[String]): Unit = {

    val car = new Car
    car.setName("宝马")
    println(car.name)

  }

}

class Car {
  @BeanProperty var name: String = null
}
