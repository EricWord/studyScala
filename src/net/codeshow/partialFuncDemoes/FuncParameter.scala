package net.codeshow.partialFuncDemoes

object FuncParameter {
  def main(args: Array[String]): Unit = {

    def plus(x: Int) = 3 + x

    val result = Array(1, 2, 3, 4).map(plus)
    println(result.mkString(","))

    //1.在scala中函数也是有类型的，比如plus就是 <function1>
    println("plus的函数类型:" + (plus _))
  }

}
