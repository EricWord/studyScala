package net.codeshow.overrideDemoes

object ScalaOverride02 {
  def main(args: Array[String]): Unit = {

    println("hello")
  }

}

abstract class A01 {
  var name: String //抽象字段
  var age: Int = 10
}

class SubA01 extends A01 {
  override var name: String = ""
  //下面这行代码会报错
  //override var age: Int = 11

}
