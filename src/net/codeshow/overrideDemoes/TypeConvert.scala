package net.codeshow.overrideDemoes

//类型转换

object TypeConvert {

  def main(args: Array[String]): Unit = {
    //使用classOf获取类名
    println(classOf[String])
    val s = "小明"
    //通过反射机制获取类名
    println(s.getClass.getName)

    //isInstanceOf 和asInstanceOf的使用
    var p1 = new Person102
    var emp = new Emp102
    //将子类引用给父类,向上转型
    p1 = emp
    //将父类引用重新转成子类(多态),即向下转型
    var emp2 = p1.asInstanceOf[Emp102]


  }
}

class Person102 {
  var name: String = "tom"

  def printName(): Unit = {
    println("Person printName() " + name)
  }
}

//继承自Person101
class Emp102 extends Person102 {
  override def printName(): Unit = {
    println("Emp printName() " + name)
    super.printName()
  }

  def sayHello(): Unit = {

  }
}

