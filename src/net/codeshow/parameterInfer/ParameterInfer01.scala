package net.codeshow.parameterInfer

object ParameterInfer01 {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4)
    println(list.map((x: Int) => x + 1))
    //简写
    println(list.map((x) => x + 1))
    //再次简写
    println(list.map(x => x + 1))
    //再简写
    println(list.map(_ + 1))

    println(list.sum)//与这种方式等价println(list.reduce(_+_))
  }
}
