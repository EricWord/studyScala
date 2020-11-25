package net.codeshow.arrayBufferDemo

import scala.collection.JavaConverters._
import scala.collection.mutable.ArrayBuffer

//Java中的Array转成scala中的ArrayBuffer
object JavaArray2ScalaArrayBuffer {
  def main(args: Array[String]): Unit = {
    val arr = ArrayBuffer("1", "2", "3")
    val javaArr = new ProcessBuilder(arr.asJava)
    val arrList = javaArr.command()
    import scala.collection.mutable

    val scalaArr: mutable.Buffer[String] = arrList.asScala
    scalaArr.append("jack")
    //移除元素
    scalaArr.remove(0)
    println(scalaArr)
  }
}
