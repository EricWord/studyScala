package net.codeshow.mixin

//富特质
object MixInProterty {
  def main(args: Array[String]): Unit = {
    val mysql = new Mysql7 with DB7
  }

}

trait DB7 {
  //富特质的普通字段被直接加入到混入对象
  var opertype: String = "insert"

  def insert(): Unit = {

  }
}

class Mysql7 {}
