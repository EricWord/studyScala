package net.codeshow.recursiveDemoes

object RecursiveMaxList {
  def main(args: Array[String]): Unit = {
    println(myMax(List(1, -1, 9)))
  }

  //使用递归求List中的最大元素
  def myMax(xs: List[Int]): Int = {
    if (xs.isEmpty)
      throw new java.util.NoSuchElementException
    if (xs.size == 1)
      xs.head
    else if (xs.head > myMax(xs.tail)) xs.head else myMax(xs.tail)
  }

}
