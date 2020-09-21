package net.codeshow.forDemos

object ForDemo3 {
  def main(args: Array[String]): Unit = {
    //    两种等价的写法
    for (i <- 1 to 3; j = i * 2) {
      println("i=" + i + "j=" + j)
    }
    println("----------------")
    for {
      i <- 1 to 3
      j = i * 2

    } {
      println("i=" + i + "j=" + j)

    }
  }

}
