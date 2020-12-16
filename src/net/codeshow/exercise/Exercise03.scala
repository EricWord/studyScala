package net.codeshow.exercise

object Exercise03 {
  def main(args: Array[String]): Unit = {
    val x = List(Some(1), None, Some(2), None, Some(3))
    println(sum(x))

  }

  //编写一个函数，计算List[Option[Int]]中所有非None值之和，不得使用match语句
  def sum(lst: List[Option[Int]]) = lst.map(_.getOrElse(0)).sum

}
