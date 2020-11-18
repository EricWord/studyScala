package net.codeshow.implicitClassDemo

object ImplicitNotice {
  def main(args: Array[String]): Unit = {
    //1.隐式转换不能有二义性
    //2.隐式转换不能嵌套使用
    implicit def f1(d: Double): Int = {
      d.toInt
      //val num2: Int = 2.2  //这样写会报错，会形成递归调用
    }

    val num1: Int = 1.1

  }

}
