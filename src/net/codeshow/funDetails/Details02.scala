package net.codeshow.funDetails

object Details02 {

  def main(args: Array[String]): Unit = {
//    打印输出结果是 ()
    println(getSum2(10, 30))

  }

  // 如果写了return,返回值类型就不能省略
  def getSum(n1: Int, n2: Int): Int = {
    return n1 + n2
  }

  //如果返回值这里什么都没有写，表示该函数没有返回值
  //这时即便是写了return也是无效的
  def getSum2(n1: Int, n2: Int) {
    return n1 + n2
  }

  def getSum3(n1: Int, n2: Int): Unit = {
    return n1 + n2
  }

}
