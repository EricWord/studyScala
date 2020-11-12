package net.codeshow.constructor

object ConDemo02 {
  def main(args: Array[String]): Unit = {

    val a = new AA("lihua")
  }

}

class AA extends BB {
  println("AA()")

  def this(name: String) {
    this //调用A的主构造器
    println("A this(name: String)")
  }

}

class BB {
  println("b~~~")

}
