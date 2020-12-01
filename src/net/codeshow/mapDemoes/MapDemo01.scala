package net.codeshow.mapDemoes

import scala.collection.mutable

object MapDemo01 {
  def main(args: Array[String]): Unit = {
    //默认Map是immutable.Map
    //key-value类型支持Any
    //在Map的底层，每对key-value是Tuple2
    val map1 = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
    println("map1:" + map1) //map1:Map(Alice -> 10, Bob -> 20, Kotlin -> 北京)

    //构造可变的map
    val map2 = mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
    println("map2:" + map2) //map2:HashMap(Bob -> 20, Alice -> 10, Kotlin -> 北京)

    //创建空的映射
    val map3 = new mutable.HashMap[String, Int]()
    println("map3:" + map3) //map3:HashMap()

    //创建对偶元组
    val map4 = mutable.Map(("Alice", 10), ("Bob", 20), ("Kotlin" -> "北京"))
    println("map4:" + map4) //map4:HashMap(Bob -> 20, Alice -> 10, Kotlin -> 北京)

    println("map1(\"Alice\"):" + map1("Alice"))

    //使用contains方法检查是否存在Key
    if (map1.contains("Alice~")) {
      println("key存在，值=" + map1("Alice~"))
    } else {
      println("值不存在")
    }

    println("map1.get(\"Alice\"):" + map1.get("Alice"))
    println("map1.get(\"Alice\").get:" + map1("Alice")) //这种使用方式如果key对应的value不存在，会抛出异常
    println("map1.getOrElse(\"Alice\", \"默认的值\"):" + map1.getOrElse("Alice", "默认的值")) //10
    println("map1.getOrElse(\"Alice~\", \"默认的值\"):" + map1.getOrElse("Alice~", "默认的值")) //如果key对应的value不存在会返回默认的值，不会抛出异常
    println("------")

    //可变map中元素的修改和添加
    val map5 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
    println("map5:" + map5) //map5:HashMap(A -> 1, B -> 北京, C -> 3)
    map5("AA") = 20 //没有这个key相当于添加 map5:HashMap(AA -> 20, A -> 1, B -> 北京, C -> 3)
    println("map5:" + map5)
    map5("A") = 20 //存在key则直接更新 map5:HashMap(AA -> 20, A -> 20, B -> 北京, C -> 3)
    println("map5:" + map5)

    map5 += ("A" -> 100) //如果key已经存在，则直接更新
    println("map5:" + map5) //map5:HashMap(AA -> 20, A -> 100, B -> 北京, C -> 3)
    map5 += ("D" -> 9090) //如果key不存在，则直接添加
    println("map5:" + map5) //map5:HashMap(AA -> 20, A -> 100, B -> 北京, C -> 3, D -> 9090)

    //增加多个元素
    map5 += ("E" -> 8080, "F" -> 7070)
    println("map5:" + map5) //map5:HashMap(AA -> 20, A -> 100, B -> 北京, C -> 3, D -> 9090, E -> 8080, F -> 7070)
    //删除元素
    map5 -= ("AA", "A") //如果key存在，删除对应的value,如果不存在，也不会报错
    println("map5:" + map5) //map5:HashMap(B -> 北京, C -> 3, D -> 9090, E -> 8080, F -> 7070)
    println("------")

    //map的遍历
    val map6 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
    //方式1
    for ((k, v) <- map6) println(k + " is mapped to " + v)
    //方式2
    for (v <- map6.keys) println(v)
    for (v <- map6.values) println(v)
    //方式3
    for (v <- map6) println(v) //此时v的类型是Tuple2
    //取出Tuple2类型的v中的Key和value
    for (v <- map6) println(v + " Key =" + v._1 + " val=" + v._2)

  }


}
