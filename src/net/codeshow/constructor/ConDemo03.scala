package net.codeshow.constructor

//构造器
object ConDemo03 {
  def main(args: Array[String]): Unit = {
//    val p1 = new Person("jack", 20)
//    println(p1)
    //下面这行代码会调用辅助构造器
    val p2 = new Person3("tom")
    println(p2)

  }

}

class Person3 private() {
  var name: String = _
  var age: Int = _

  override def toString: String = {
    "name=" + this.name + "\tage=" + this.age
  }

  def this(name: String) {
    //辅助构造器，必须在第一行显式调用主构造器
    this()
    this.name = name

  }

}
