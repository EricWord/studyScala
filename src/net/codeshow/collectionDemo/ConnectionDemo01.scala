package net.codeshow.collectionDemo

//可变集合和不可变集合体系
object ConnectionDemo01 {
  def main(args: Array[String]): Unit = {
    //字符串在scala中就是char的集合(IndexedSeq)
    val str = "hello"
    for (item <- str) {
      println(item)
    }
    println(str(2))
  }

}
