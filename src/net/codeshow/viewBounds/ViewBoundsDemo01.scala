package net.codeshow.viewBounds

object ViewBoundsDemo01 {
  def main(args: Array[String]): Unit = {
    val commCompare01 = new CommonCompare(1, 20)
    println(commCompare01.greater)
  }
}

//T <% Comparable[T] 表示 T是Comparable子类型
//T <% Comparable[T] 与 T <: Comparable[T]的区别就是前者支持隐式转换
class CommonCompare[T <% Comparable[T]](obj1: T, obj2: T) {
  def greater: T = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}