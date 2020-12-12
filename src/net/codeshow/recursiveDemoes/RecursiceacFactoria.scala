package net.codeshow.recursiveDemoes

object RecursiceacFactoria {
  def main(args: Array[String]): Unit = {
    println(factorial(2))
  }

  //递归的方式求阶乘
  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)

}
