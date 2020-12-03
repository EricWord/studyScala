package net.codeshow.mapOperateDemoes

//map映射
object MapOperateDemo01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(3, 5, 7)
    var list2 = List[Int]()
    for (item <- list1) { //遍历
      //对每一个元素*2然后加入到list2中
      list2 = list2 :+ item * 2
    }
    println("list2：" + list2)

  }

}
