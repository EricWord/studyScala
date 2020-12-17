package net.codeshow.generic

object GenericDemo03 {
  def main(args: Array[String]): Unit = {
    val list1 = List("hello", "dog", "world")
    val list2 = List(90, 10, 23)
    println("midList[String](list1)=" + midList[String](list1))
    println("midList[Int](list2)=" + midList[Int](list2))
  }


  //定义一个函数，可以获取各种类型的List的中间index的值
  //使用泛型完成
  def midList[E](l: List[E]): E = {
    l(l.length / 2)
  }
}
