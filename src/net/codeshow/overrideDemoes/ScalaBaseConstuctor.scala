package net.codeshow.overrideDemoes

object ScalaBaseConstuctor {
  def main(args: Array[String]): Unit = {
    val emp = new Emp600("mary")


  }

}

class Person600(pName: String) {
  var name = "张三"
  println("Person...")

  def this() {
    this("默认的名字")
    println("默认的名字")
  }
}

class Emp600 extends Person600 {
  println("Emp...")

  def this(name: String) {
    this
    this.name = name
    println("Emp 辅助构造器~")
  }
}