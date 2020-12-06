package net.codeshow.AccompanyObj

object ApplyDemo01 {
  def main(args: Array[String]): Unit = {

    val pig = new Pig("小花")
    val pig2 = Pig("小黑猪")
    val pig3 = Pig()
    println("pig2.name=" + pig2.name)
    println("pig3.name=" + pig3.name)
  }

}

class Pig(pName: String) {
  var name: String = pName
}

object Pig {
  //apply方法
  def apply(pName: String): Pig = new Pig(pName)

  def apply(): Pig = new Pig("匿名猪猪")
}
