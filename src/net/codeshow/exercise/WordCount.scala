package net.codeshow.exercise

object WordCount {
  def main(args: Array[String]): Unit = {

    val lines = List("atguigu han hello ", "atguigu han aaa aaa aaa ccc ddd uuu")
    //先分步完成，再组合
    //1.
    //    val res = lines.flatMap((s: String) => s.split(" "))
    //上面代码的简化形式
    val res = lines.flatMap(_.split(" "))
    println("res=" + res)
    //2.
    //    val res2 = res.map((s: String) => (s, 1))
    //上面代码的简化形式
    val res2 = res.map((_, 1))
    println("res2" + res2)

    //3.分组，把不同的单词归属到不同的组
    //    val res3 = res2.groupBy((x: (String, Int)) => x._1)
    //上面代码的简化形式
    val res3 = res2.groupBy((x: (String, Int)) => x._1)
    println("res3=" + res3)

    //4.对上面的各个元组进行统计大小
    //    val res4 = res3.map((x: (String, List[(String, Int)])) => (x._1, x._2.size))
    //上一行代码的简写方式
    val res4 = res3.map(x => (x._1, x._2.size))
    println("res4=" + res4)

    //5.排序
    //    res4.toList.sortBy((x: (String, Int)) => x._2)
    //上面代码的简写形式
    val res5 = res4.toList.sortBy(_._2).reverse
    println("res5=" + res5)

    println("----------------")
    //合并
    println(lines.flatMap(_.split(" ")).map((_, 1)).groupBy((x: (String, Int)) => x._1).map(x => (x._1, x._2.size)).toList.sortBy(_._2).reverse)


  }

}
