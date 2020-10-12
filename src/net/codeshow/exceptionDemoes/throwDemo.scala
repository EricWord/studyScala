package net.codeshow.exceptionDemoes

object throwDemo {
  def main(args: Array[String]): Unit = {


    try {
      val res = test()
      println(res.toString)
    } catch {
      case ex: Exception => println("捕获到异常" + ex.getMessage)
    } finally {

    }
    println("ok~~~~")
  }

  def test(): Nothing = {
    throw new Exception("异常出现了...")
  }

}
