package net.codeshow.exercise

object Excise02 {
  def main(args: Array[String]): Unit = {
    println(swap02(Array(1, 2, "hello")).toBuffer)

  }

  //利用模式匹配，编写一个swap函数，交换数组中的前两个元素的位置，前提条件是数组长度至少为2
  def swap02(arr: Array[Any]) = {
    arr match {
      case Array(first, second, rest@_*) => Array(second, first) ++ rest
      case _ => arr //不满足条件直接原封不同地返回
    }

  }
}
