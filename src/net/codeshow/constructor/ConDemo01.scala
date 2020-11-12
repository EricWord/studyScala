package net.codeshow.constructor

//构造器
object ConDemo01 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("jack", 20)
    println(p1)

  }

}

class Person(inName: String, inAge: Int) {
  var name: String = inName
  var age: Int = inAge

  override def toString: String = {
    "name=" + this.name + "\tage=" + this.age
  }

}
