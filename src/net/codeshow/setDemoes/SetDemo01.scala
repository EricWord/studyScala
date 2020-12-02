package net.codeshow.setDemoes

import scala.collection.mutable

object SetDemo01 {
  def main(args: Array[String]): Unit = {
    val set = Set(1, 2, 3) //不可变
    println(set)
    val set2 = mutable.Set(1, 2, "Hello") //可变的
    println("set2:" + set2) //set2:HashSet(1, 2, Hello)

    //元素的添加
    //方式1
    set2.add(4)
    println("set2:" + set2) //set2:HashSet(1, 2, 4, Hello)
    //方式2
    set2 += 5
    println("set2:" + set2) //set2:HashSet(1, 2, 4, Hello, 5)
    //方式3
    set2.+=(6)
    println("set2:" + set2) //set2:HashSet(1, 2, 4, Hello, 5, 6)
    set2 += 5 //如果要添加的对象已经存在，不会重复添加，也不会报错
    println("set2:" + set2) //set2:HashSet(1, 2, 4, Hello, 5, 6)

    //获取 最大值
    println(set.max)


  }

}
