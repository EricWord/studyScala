package net.codeshow.breakDemos

import util.control.Breaks._

object BreakDemo1 {

  def main(args: Array[String]): Unit = {
    var n = 1
    //      breakable是高阶函数:可以接收函数的函数
    // def breakable(op: => Unit): Unit
    //    op: => Unit表示接收的参数是一个没有输入也没有返回值的函数
    //    breakable函数对break()抛出的异常进行了捕获
    //    当传入breakable的是代码块时将()换为{}
    breakable {
      while (n <= 20) {
        n += 1
        println("n=" + n)
        if (n == 18) {
          //        在scala中使用break()中断循环
          break()
        }

      }
    }
    println("ok~~~")
  }

}
