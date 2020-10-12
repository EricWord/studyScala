package net.codeshow.exceptionDemoes

object exception01 {
  def main(args: Array[String]): Unit = {
    try {
      val r = 10 / 0

    } catch {
          //在scala中只有一个catch
          //一个catch中可以有多个case
          //=> 关键符号，表示后面是对该异常的处理代码块
      case ex: ArithmeticException => println("捕获了除数为0的算术异常")
      case ex: Exception => println("捕获了异常")

    }finally{
      //最终要执行的代码
      println("scala finally")
    }
  }

}
