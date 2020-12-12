package net.codeshow.recursiveDemoes

import java.text.SimpleDateFormat
import java.util.Date

object RecursiveDemo01 {
  def main(args: Array[String]): Unit = {
    val now = new Date()
    val dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val start = dateFormat.format(now)
    println("执行前的时间" + start)
    var num = BigInt(1)
    var sum = BigInt(0)
    var res = mx(num, sum)
    println("res=" + res)
    val now2 = new Date()
    val dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val end = dateFormat.format(now2)
    println("执行后的时间" + end)

  }

  //递归的求和
  def mx(num: BigInt, sum: BigInt): BigInt = {
    if (num <= 999999991) mx(num + 1, sum + num)
    else sum
  }

}
