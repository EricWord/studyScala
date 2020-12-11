package net.codeshow.curryDemoes

object CurryDemo02 {
  def main(args: Array[String]): Unit = {
    //这是一个函数，可以接收两个字符串，比较是否相等
    def eq(s1: String, s2: String): Boolean = {
      s1.equals(s2)
    }

    //隐式类
    implicit class TestEq(s: String) {
      //体现了将比较字符串的事情，分解成两个任务完成
      //1.checkEq 完成转换大小写的任务
      //2. f函数完成比较的任务
      def checkEq(ss: String)(f: (String, String) => Boolean): Boolean = {
        f(s.toLowerCase, ss.toLowerCase)
      }
    }

    val str1 = "hello"
    val res = str1.checkEq("HeLLO")(eq)
    println("res=" + res)

    //下面是一种简写形式
    val res2 = str1.checkEq("HeLLO")(_.equals(_))
    println("res2=" + res2)

  }

}
