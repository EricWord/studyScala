package net.codeshow.scanDemoes

import scala.collection.mutable.ArrayBuffer

object Excise01 {
  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAABBBBBBBBBBBBCCCCCCCCCCCDDDDDD"
    val arrayBuffer = new ArrayBuffer[Char]()
    sentence.foldLeft(arrayBuffer)(putArray)
    println("arrayBuffer=" + arrayBuffer)
  }

  def putArray(arr: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {

    //将c放到arr中
    arr.append(c)
    arr

  }

}
