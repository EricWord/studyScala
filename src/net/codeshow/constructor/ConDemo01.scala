package net.codeshow.constructor

//构造器
object ConDemo01 {
  def main(args: Array[String]): Unit = {
//    val p1 = new Person("jack", 20)
//    println(p1)
    //下面这行代码会调用辅助构造器
    val p2 = new Person("tom")
    println(p2)

  }

}

class Person(inName: String, inAge: Int) {
  var name: String = inName
  var age: Int = inAge

  override def toString: String = {
    "name=" + this.name + "\tage=" + this.age
  }

  def this(name: String) {
    //辅助构造器，必须在第一行显式调用主构造器
    this("jack", 10)
    this.name = name

  }

}
