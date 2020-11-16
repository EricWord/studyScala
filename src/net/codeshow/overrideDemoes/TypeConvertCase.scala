package net.codeshow.overrideDemoes

object TypeConvertCase {
  def main(args: Array[String]): Unit = {

  }

  //写了一个参数多态代码
  //因为在oop中一个父类的引用可以接收所有子类的引用
  def test(p:Person400): Unit ={

  }

}

class Person400 {
  def printName(): Unit = {
    println("Person400 printName")
  }

  def sayOk(): Unit = {
    println("Person400 sayOk")
  }
}

class Student400 extends Person400 {
  val stuId = 100

  override def printName(): Unit = {
    println("Student400 printName")
  }

  def cry(): Unit = {
    println("学生的id=" + this.stuId)
  }

}

class Emp400 extends Person400 {
  val empId = 800

  override def printName(): Unit = {
    println("Emp400 printName")
  }

  def showInfo(): Unit = {
    println("学生的id=" + this.empId)
  }

}
