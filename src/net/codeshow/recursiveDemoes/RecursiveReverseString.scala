package net.codeshow.recursiveDemoes

object RecursiveReverseString {
  def main(args: Array[String]): Unit = {
    val str = "Hello"
    val res = reverse(str)
    println(res)
  }

  //使用递归完成字符串的翻转
  def reverse(xs: String): String = {
    if (xs.length == 1)
      xs
    else
      reverse(xs.tail) + xs.head
  }

}
