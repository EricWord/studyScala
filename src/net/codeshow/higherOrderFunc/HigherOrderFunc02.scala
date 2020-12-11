package net.codeshow.higherOrderFunc

object HigherOrderFunc02 {
  def main(args: Array[String]): Unit = {

    //1.minuxy 是一个高阶函数，因为它返回一个匿名函数
    //2.返回的匿名函数是 (y: Int) => x - y
    //3.返回的匿名函数可以使用变量接收
    def minuxy(x: Int) = {
      (y: Int) => x - y
    }

    val result3 = minuxy(3)(5)
    println(result3)
  }

}
