package net.codeshow.iteratorDemoes

object IteratorDemo01 {
  def main(args: Array[String]): Unit = {
    val iterator = List(1, 2, 3, 4, 5).iterator
    //遍历方式1
    println("--遍历方式1--")

    while (iterator.hasNext) {
      println(iterator.next())
    }
    //遍历方式2
    println("--遍历方式2--")
    for (enum <- iterator) {
      println(enum)

    }
  }

}
