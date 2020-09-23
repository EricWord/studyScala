package net.codeshow.continueDemos

object ContinueDemo1 {
  def main(args: Array[String]): Unit = {
    //    后面if里的条件为真才执行循环体
    for (i <- 1 to 10 if (i != 2 && i != 3)) {
      println("i=" + i)

    }
  }

}
