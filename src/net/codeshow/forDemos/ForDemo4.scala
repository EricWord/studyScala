package net.codeshow.forDemos

object ForDemo4 {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j = 4 - i) {
      println(j)
    }
  }

}
