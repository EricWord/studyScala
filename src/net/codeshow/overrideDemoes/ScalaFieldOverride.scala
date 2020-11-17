package net.codeshow.overrideDemoes

object ScalaFieldOverride {
  def main(args: Array[String]): Unit = {

    val obj1: AAA = new BBB
    val obj2: BBB = new BBB
    println("obj1.age=" + obj1.age + "\tobj2.age=" + obj2.age)

  }

}

class AAA {
  val age: Int = 10

}

class BBB extends AAA {
  override val age: Int = 20
}
