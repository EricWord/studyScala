package net.codeshow.forDemos

object ForDemo6 {
  //  def main(args: Array[String]): Unit = {
  //    for (i <- Array(1, 2, 3)) yield i * 2
  //
  //  }
  //  def main(args: Array[String]): Unit = {
  //    val nums = List(1, 2, 3, 4, 5).filter(_ < 4)
  //    println(nums)
  //  }

  def main(args: Array[String]): Unit = {
    val nums = List(1, 2, 3, 4, 5).filter(_ < 4).map(_ * 2)
    println(nums)
  }

}
