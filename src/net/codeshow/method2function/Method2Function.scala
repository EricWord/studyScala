package net.codeshow.method2function

object Method2Function {
  def main(args: Array[String]): Unit = {
    //使用方法
    // 先创建一个对象
    val dog = new Dog
    println(dog.sum(10, 20))
    //    方法转成函数
    val f1 = dog.sum _
    println("f1=" + f1(50, 60))
    //   函数，求两个数的和
    val f2 = (n1: Int, n2: Int) => {
      n1 + n2

    }
    println("f2=" + f2(50, 60))
  }

}

class Dog {
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2

  }
}
