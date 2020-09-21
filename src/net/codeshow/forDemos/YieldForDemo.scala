package net.codeshow.forDemos

object YieldForDemo {
  def main(args: Array[String]): Unit = {
    var res = for (i <- 1 to 10) yield {
      if (i % 2 == 0) {
        i
      } else {
        "不是偶数"
      }
    }
    //    yield i将每次循环得到的i放入集合vector中，并返回给res
    //    i处可以是一个代码块
    println(res)
  }

}
