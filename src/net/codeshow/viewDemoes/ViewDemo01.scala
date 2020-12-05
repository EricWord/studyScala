package net.codeshow.viewDemoes

object ViewDemo01 {
  def main(args: Array[String]): Unit = {
    def multiple(num: Int): Int = {
      num
    }

    def eq(i: Int): Boolean = {
      i.toString.equals(i.toString.reverse)
    }

    //没有使用view
    val viewSquares1 = (1 to 100).filter(eq)
    println("viewSquares1:" + viewSquares1) //viewSquares1:Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99)

    //使用view
    val viewSquares2 = (1 to 100).view.filter(eq)
    println("viewSquares2:" + viewSquares2) //viewSquares2:View(<not computed>)
    //遍历
    for (item <- viewSquares2) {
      println("item=" + item)
    }
  }
}
