package net.codeshow.oop

object PropertyDemo {
  def main(args: Array[String]): Unit = {

    val emp = new Emp
    //如果希望将子类对象，交给父类的引用，这时就需要写上类型
    val emp2: Person = new Emp

  }

}

class Person {

}

class Emp extends Person {

}
