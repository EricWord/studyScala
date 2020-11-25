package net.codeshow.arrayBufferDemo

import scala.collection.mutable.ArrayBuffer

//scala集合与java的List互转
object ArrayBuffer2JavaList {
  def main(args: Array[String]): Unit = {
    val arr = ArrayBuffer("1", "2", "3")
    val javaArr = new ProcessBuilder(arr.toString())
    val arrList = javaArr.command()
    println(arrList)
  }

}
