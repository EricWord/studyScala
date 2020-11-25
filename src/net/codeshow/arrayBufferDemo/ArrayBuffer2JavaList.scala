package net.codeshow.arrayBufferDemo

import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConverters._

//scala集合与java的List互转
object ArrayBuffer2JavaList {
  def main(args: Array[String]): Unit = {
    val arr = ArrayBuffer("1", "2", "3")
    val javaArr = new ProcessBuilder(arr.asJava)
    val arrList = javaArr.command()
    println(arrList)
  }

}
