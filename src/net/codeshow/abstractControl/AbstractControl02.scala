package net.codeshow.abstractControl

object AbstractControl02 {
  def main(args: Array[String]): Unit = {
    var x = 10
    until(x > 0) {
      x -= 1
      println("x=" + x)
    }
  }

  @scala.annotation.tailrec
  def until(condition: => Boolean)(block: => Unit): Unit = {
    //类似while循环，递归
    if (condition) {
      block
      //递归调用until
      until(condition)(block)
    }
  }

}
