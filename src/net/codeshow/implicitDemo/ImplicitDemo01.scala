package net.codeshow.implicitDemo

//隐式转换
object ImplicitDemo01 {
  def main(args: Array[String]): Unit = {

    //编写一个隐式函数转成 Double -> Int 转换
    implicit def f1(d: Double): Int = {
      d.toInt

    }

    implicit def f2(f: Float): Int = {
      f.toInt

    }

    val num: Int = 3.5
    val num2: Int = 6.6f
    println("num =" + num)
    println("num2 =" + num2)
  }

}
