package net.codeshow.varDemo01

object VarDemo02 {

  def main(args: Array[String]): Unit = {
    //    类型推导
    var num = 10
    //   判断num的类型是否为Int
    println(num.isInstanceOf[Int])
    //    类型一旦确定之后就不能修改,scala是强类型的语言


    //    var修饰的变量可以修改，val修饰的变量不可以修改
    //    val没有线程安全问题，因此同步效率较高

    val dog = new Dog
    dog.age = 90
    dog.name = "大黄"
  }

}

class Dog {
  //  声明一个属性，给了一个默认值
  var age: Int = _
  var name: String = ""
}
