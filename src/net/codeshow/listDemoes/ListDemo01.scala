package net.codeshow.listDemoes

object ListDemo01 {
  def main(args: Array[String]): Unit = {
    //说明
    //1.在默认情况下List是scala.collection.immutable.List,即不可变
    //2.在Scala中List就是不可变的，如果需要使用可变的List,可以使用ListBuffer
    //创建时直接分配元素
    val list01 = List(1, 2, 3)
    println(list01)
    val list02 = Nil
    println(list02)
    //访问List中的元素
    val value1 = list01(1) //1是索引，表示取出第二个元素
    println("value1=" + value1)

    //通过:+ 和 +: 给list追加元素(本身的集合并没有变化)
    val list1 = List(1, 2, 3, "abc")
    //:+运算符表示在列表的最后增加数据
    val list2 = list1 :+ 4
    println("list1:" + list1) //list1没有变化
    println("list2:" + list2) //list2的内容：List(1, 2, 3, abc, 4)
    //+: 表示在List的前面添加元素
    val list3 = 10 +: list1
    println("list3:" + list3)

    //::符合的使用
    val list4 = List(1, 2, 3, "abc")
    val list5 = 4 :: 5 :: 6 :: list4 :: Nil
    println("list5:" + list5)

    //::: 的使用
    //:::两边都得是集合
    val list6 = 4 :: 5 :: 6 :: list4 ::: Nil
    println("list6:" + list6)
  }
}
