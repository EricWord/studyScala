package net.codeshow.method

object MethodDemo02 {
  def main(args: Array[String]): Unit = {
    //编写一个方法，方法不需要参数，在方法中打印一个10*8的矩形，在main方法中调用该方法
    val m = new MethodExec
    m.printRect()
    //编写一个方法，方法不需要参数，计算矩形的面积，并将其作为方法返回值，在main中调用该方法，接收返回的面积值并打印
    m.width = 2.1
    m.len = 3.4
    println("面积为:" + m.area())
  }

}

class MethodExec {
  var len = 0.0
  var width = 0.0

  def printRect(): Unit = {
    for (i <- 0 until 10) {
      for (j <- 0 until 8) {
        print("*")
      }
      println()
    }
  }

  //计算面积的方法
  def area(): Double = {
    (this.width * this.len).formatted("%.2f").toDouble
  }
}
