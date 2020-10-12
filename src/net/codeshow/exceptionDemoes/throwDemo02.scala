package net.codeshow.exceptionDemoes

object throwDemo02 {
  def main(args: Array[String]): Unit = {
    f11()

  }

  //通过注解的方式来抛出异常
  @throws(classOf[NumberFormatException])
  def f11() = {
    "abc".toInt
  }
}
