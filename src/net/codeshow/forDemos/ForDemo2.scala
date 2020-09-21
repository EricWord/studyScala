package net.codeshow.forDemos

object ForDemo2 {

  def main(args: Array[String]): Unit = {
    //    until与to的区别就是until不包含结尾，to包含
    for (i <- 1 until 10) {
      println("lucky," + i)
    }
  }

}
