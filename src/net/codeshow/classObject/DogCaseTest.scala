package net.codeshow.classObject

object DogCaseTest {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    dog.name = "tomcat"
    dog.age = 2
    dog.weight = 6
    println(dog.say())

  }

}

class Dog {
  var name = ""
  var age = 0
  var weight = 0.0

  def say(): String = {
    "小狗的信息如下:name=" + this.name + "\t age=" + this.age + "\t weight=" + this.weight
  }
}
