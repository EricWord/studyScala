package net.codeshow.tupleDemoes

object TupleDemo01 {
  def main(args: Array[String]): Unit = {
    //创建Tuple
    //tuple1 就是一个Tuple,类型是Tuple5
    //为了高效操作元组，编译器根据元素的个数不同，对应不同的元组类型
    //分别 Tuple1 ~ Tuple22
    val tuple1 = (1, 2, 3, "hello", 4)
    println(tuple1)
    //访问指定的元素,方式1,这种方式从1开始是第一个元素
    println(tuple1._1)
    //访问指定元素，方式2，这种方式下标从0开始
    println(tuple1.productElement(0))

    println("---遍历元组---")
    for (item <- tuple1.productIterator) {
      println("item=" + item)
    }
  }
}
