package net.codeshow.visit

object TestVisit {
  def main(args: Array[String]): Unit = {
    val c = new Clerk
    c.showInfo()

    val p1 = new Person
    println(p1.name)
  }

}

class Clerk {
  //在底层生成可读可写的方法
  var name: String = "jack"
  //底层生成只读的方法
  private var sal: Double = 9999.9
  protected var age = 10
  //scala中没有Public关键字
  var job: String = "大数据工程师"

  def showInfo(): Unit = {
    println(" name " + name + " sal= " + sal)
  }
}

//当一个文件中出现了class Clerk 和 object Clerk
//1.class Clerk称为伴生类
//2.object Clerk称为伴生对象
//3.因为scala的设计者将static去掉了，设计了伴生对象和伴生类的概念
//4.将静态的内容放到伴生对象中，将非静态的内容放到伴生类中
object Clerk {
  def test(c: Clerk): Unit = {
    println("test() name=" + c.name + " sal= " + c.sal)
    println(c.age)
  }
}

class Person {
  //单独写private是不能被外部访问的，如果想让外部访问需要增加包访问权限
  private[visit] val name = "jack"
  //
}
