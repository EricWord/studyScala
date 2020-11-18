package net.codeshow.implicitClassDemo

//隐式类
object ImplicitClassDemo01 {
  def main(args: Array[String]): Unit = {
    //DB1 是一个隐式类
    //当我们在该隐式类的作用于范围，创建MySQL1实例
    //该隐式类就会生效，这个工作由编译器完成
    implicit class DB1(val m: MySQL1) {
      def addSuffix(): String = {
        m + " scala"
      }
    }

    val mySQL = new MySQL1
    mySQL.sayOk()
    mySQL.addSuffix()

    implicit def f1(d: Double): Int = {
      d.toInt
    }

    def test1(n1: Int): Unit = {
      println("ok")

    }

    test1(10.1)

  }

}


class MySQL1 {
  def sayOk(): Unit = {
    println("sayOk")
  }
}
