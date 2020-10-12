package net.codeshow.funDetails

object Details06 {

  def main(args: Array[String]): Unit = {

  }

  //递归函数必须指定返回值类型，不能自动进行类型推断
  def f1(n: Int): Unit = {
    if (n == 1) {
      1

    } else {
      f1(n - 1)
    }

  }

}
