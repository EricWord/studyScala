package net.codeshow.listBufferDemoes

import scala.collection.mutable.ListBuffer

object ListBufferDemo01 {
  def main(args: Array[String]): Unit = {
    val lst0 = ListBuffer[Int](1, 2, 3)
    println("lst0(2)=" + lst0(2))
    for (item <- lst0) {
      println("item=" + item)
    }

    val lst1 = new ListBuffer[Int] //空的
    lst1 += 4 //增加单个元素
    println("lst1:" + lst1)
    lst1.append(5) //支持增加多个元素
    println("lst1:" + lst1)

    lst0 ++= lst1
    println("lst0:" + lst0)
    val lst2 = lst0 ++ lst1
    println("lst2:" + lst2)
    val lst3 = lst0 :+ 5

    println("lst3:" + lst3)
    println("===删除===")
    println("lst1=" + lst1)
    lst1.remove(1)
    for (item <- lst1) {
      println("item=" + item)
    }


  }

}
