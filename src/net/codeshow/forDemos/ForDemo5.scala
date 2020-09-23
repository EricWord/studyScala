package net.codeshow.forDemos

object ForDemo5 {
  def main(args: Array[String]): Unit = {
    //    多重循环,也可以写成嵌套的形式
    for (i <- 1 to 3; j <- 1 to 3) {
      println("i=" + i + ",j=" + j)

    }
  }

}
