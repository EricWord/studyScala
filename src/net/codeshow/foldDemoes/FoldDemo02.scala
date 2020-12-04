package net.codeshow.foldDemoes

object FoldDemo02 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 9, 2, 8)

    def minus(num1: Int, num2: Int): Int = {
      num1 - num2
    }
    var i = (1 /: list) (minus)
  }

}
