package net.codeshow.partialFuncDemoes

object PartialFuncDemo02 {
  def main(args: Array[String]): Unit = {
    //使用偏函数解决
    val list = List(1, 2, 3, 4, "abc")
    //定义一个偏函数 PartialFunction[Any,Int] 表示偏函数接收的参数类型是Any,返回类型是Int
    val partialFunc = new PartialFunction[Any, Int] {
      //isDefinedAt(x: Any)如果返回true 就会去调用apply方法 构建对象实例
      override def isDefinedAt(x: Any): Boolean = {
        println("x=" + x)
        x.isInstanceOf[Int]
      }

      //apply(v1: Any) 构造器，对传入的值+1并返回（新的集合）
      override def apply(v1: Any): Int = {
        println("v1=" + v1)
        v1.asInstanceOf[Int] + 1

      }
    }

    //偏函数的执行流程
    //1.遍历list所有的元素
    //2.调用isDefinedAt
    //3.每得到一个元素，放入新的集合，最后返回

    val list2 = list.collect(partialFunc)
    println("list2:" + list2)


  }

}
