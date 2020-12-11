package net.codeshow.partialFuncDemoes

object PartialFunc03 {
  def main(args: Array[String]): Unit = {
    //第一种简化形式
    def partialFun2: PartialFunction[Any, Int] = {
      case i: Int => i + 1
      case j: Double => (j * 2).toInt
      case k: Float => (k * 3).toInt

    }

    val list = List(1, 2, 3, 4, 1.2, 2.4, 1.9f, "abc")
    val list2 = list.collect(partialFun2)
    println("list2=" + list2)
    //第二种简化形式
    val list3 = list.collect {
      case i: Int => i + 1
      case j: Double => (j * 2).toInt
      case k: Float => (k * 3).toInt
    }
    println("list3=" + list3)


  }

}
