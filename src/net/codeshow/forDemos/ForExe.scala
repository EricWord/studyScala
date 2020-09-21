package net.codeshow.forDemos

object ForExe {
  def main(args: Array[String]): Unit = {
    //    打印1~100之间所有是9的倍数的个数及总和
    var count = 0
    var sum = 0
    for (i <- 1 to 100) {
      if (i % 9 == 0) {
        sum += i
        count += 1

      }

    }
    println("count=" + count + ",sum=" + sum)
  }

}
