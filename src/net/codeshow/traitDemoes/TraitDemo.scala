package net.codeshow.traitDemoes
//特质 trait
object TraitDemo {
  def main(args: Array[String]): Unit = {
    val c = new C()
    val f = new F()
    c.getConnect()
    f.getConnect()

  }
}

//按照要求定义一个trait
trait Trait01{
  //定义一个规范
  def getConnect()
}
class A{}
class B extends A{}
class C extends A with Trait01 {
  override def getConnect(): Unit = {
    println("连接MySQL数据库...")
  }
}
class D{}
class E extends D{}
class F extends D with Trait01 {
  override def getConnect(): Unit = {
    println("连接Oracle数据库...")
  }
}

