package net.codeshow.AccompanyObj

//伴生对象
object AccompanyObject {
  def main(args: Array[String]): Unit = {

    println(ScalaPerson.sex)
    ScalaPerson.sayHi()
  }

}

//伴生类
//将非静态的内容写到伴生类中
class ScalaPerson {
  var name: String = _

}

//伴生对象
//将静态的内容写到伴生对象中
object ScalaPerson {

  var sex: Boolean = true

  def sayHi(): Unit = {
    println("object ScalaPerson sayHi")
  }
}
