package net.codeshow.extendTrait

object ExtendTraitDemo01 {
  def main(args: Array[String]): Unit = {
//    println("haha")


  }

}

trait LoggedException extends Exception {
  def log(): Unit = {
    println(getMessage()) //方法来自于Exception类
  }
}

class UnhappyException extends LoggedException {
  //已经是Exception的子类了，所以可以重写方法
  override def getMessage = "错误消息！"
}

class UnhappyException2 extends IndexOutOfBoundsException with LoggedException {
  //已经是Exception的子类了，所以可以重写方法
  override def getMessage = "错误消息！"
}

class CCC extends Exception {}

//错误的原因是 CCC 不是Exception子类
class UnhappyException3 extends CCC with LoggedException {
  //已经是Exception的子类了，所以可以重写方法
  override def getMessage = "错误消息！"
}



