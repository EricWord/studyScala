package net.codeshow.matchDemoes

object CaseClassDemo02 {
  def main(args: Array[String]): Unit = {
    //该案例的作用就是体验使用样例类方式进行对象的匹配简洁性
    for (amt <- Array(Dollar(1000.0), Currency(1000.0, "RMB"), NoAmount)) {
      val result = amt match {
        case Dollar(v) => "$" + v
        case Currency(v, u) => v + " " + u
        case NoAmount => ""
      }
      println(amt + ":" + result)
      //输出结果
//      Dollar(1000.0):$1000.0
//      Currency(1000.0,RMB):1000.0 RMB
//        NoAmount:

    }
  }


}

//下面的均是样例类
abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object NoAmount extends Amount

