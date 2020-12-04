package net.codeshow.foldDemoes

object FoldDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)

    def minus(num1: Int, num2: Int): Int = {
      num1 - num2
    }

    //说明
    //1.折叠的理解和化简的运行机制几乎一样
    //步骤1 list.foldLeft(5)(minus) 可以理解成list(5,1, 2, 3, 4) list.reduceLeft(minus)
    println(list.foldLeft(5)(minus)) //函数的柯里化
    println(list.foldRight(5)(minus))

  }

}
