package net.codeshow.implicitDemo

object ImplicitValueDemo03 {
  def main(args: Array[String]): Unit = {

    implicit val str1: String = "jack"

    //implicit name: String 这样写的话 name就是隐式参数
    def hello(implicit name: String): Unit = {
      println(name + " hello")
    }
    hello//使用隐式值的时候不要带()
  }

}
