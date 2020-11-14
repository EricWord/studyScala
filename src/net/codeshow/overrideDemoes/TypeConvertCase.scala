package net.codeshow.overrideDemoes

object TypeConvertCase {
  def main(args: Array[String]): Unit = {
    val stu = new Student400
    val emp = new Emp400
    test(stu)
    test(emp)

  }

  //在oop中一个父类的引用可以接收所有子类的引用，参数多态
  def test(p: Person400): Unit = {
    //使用scala中类型检查和转换
    p match {
      case emp40: Emp400 =>
        emp40.showInfo()
      case student40: Student400 =>
        student40.cry()

      case _ =>
        println("转换失败")
    }
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
  var stuId = 100

  override def printName(): Unit = {
    println("Student400 printName")
  }

  def cry(): Unit = {
    println("学生的id= " + this.stuId)
  }
}

class Emp400 extends Person400 {
  var empId = 800

  override def printName(): Unit = {
    println("Student400 printName")
  }

  def showInfo(): Unit = {
    println("雇员的id= " + this.empId)
  }
}
