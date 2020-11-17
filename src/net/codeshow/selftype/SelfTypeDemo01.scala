package net.codeshow.selftype

object SelfTypeDemo01 {
  def main(args: Array[String]): Unit = {

  }

}

//Logger 就是自身类型特质
//相当于trait Logger extends Exception,要求混入该特质的类也是Exception子类
trait Logger {
  //明确告诉编译器，我就是Exception,如果没有这句话，下面的getMessage不能调用
  this: Exception =>
  def log(): Unit = {
    println(getMessage)
  }
}

//class Console extends Logger //错误
class Console extends Exception with Logger //正确
