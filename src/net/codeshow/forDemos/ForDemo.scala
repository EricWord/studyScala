package net.codeshow.forDemos

object ForDemo {
  def main(args: Array[String]): Unit = {
//    注意to是关键字，前后闭合
    for (i <- 1 to 10) {
      println("hello," + i)
    }
  }

}
