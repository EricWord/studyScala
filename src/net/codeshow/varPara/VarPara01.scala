package net.codeshow.varPara

object VarPara01 {
  def main(args: Array[String]): Unit = {

    println(sum(10, 30, 10, 3, 45, 7))
  }

  //注意可变参数只能写在形参列表的最后
  def sum(n1: Int, args: Int*): Int = {
    println("args.length=" + args.length)
    //遍历
    var sum = n1
    for (item <- args) {
      sum += item
    }
    sum

  }


}
