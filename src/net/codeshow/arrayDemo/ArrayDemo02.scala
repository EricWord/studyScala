package net.codeshow.arrayDemo

object ArrayDemo02 {
  def main(args: Array[String]): Unit = {
    // 1, 3, "xxx" 都是数组中的元素
    var arr02 = Array(1, 3, "xxx")
    for (i <- arr02) {
      println(i)
    }
  }

}
