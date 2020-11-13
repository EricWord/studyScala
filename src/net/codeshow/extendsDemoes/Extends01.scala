package net.codeshow.extendsDemoes

object Extends01 {
  def main(args: Array[String]): Unit = {
    val student = new Student
    student.name = "jack"
    student.studying()
    student.showInfo()
  }

}

class Person {
  var name: String = _
  var age: Int = _

  def showInfo(): Unit = {
    println("学生信息如下:")
    println("名字: " + this.name)
  }
}

class Student extends Person {
  def studying(): Unit = {
    //这里可以使用父类的属性
    println(this.name + "学习 scala中....")
  }
}
