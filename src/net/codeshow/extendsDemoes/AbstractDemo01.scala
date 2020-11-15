package net.codeshow.extendsDemoes

object AbstractDemo01 {
  def main(args: Array[String]): Unit = {

  }

}

abstract class Animal{
  var name:String//抽象的字段
  var age:Int
  var color:String="black"
  def cry()
}