package net.codeshow.overrideDemoes
//重写
object Override01 {
  def main(args: Array[String]): Unit = {

  }

}

class Person101 {
  var name: String = "tom"

  def printName(): Unit = {
    println("Person printName() " + name)
  }
}

//继承自Person101
class Emp100 extends Person101 {
  override def printName(): Unit = {
    println("Emp printName() " + name)
    super.printName()
  }
}
