package net.codeshow.singleton

object TestSingleTon2 {
  def main(args: Array[String]): Unit = {
    val instance1 = SingleTon2.getInstance
    val instance2 = SingleTon2.getInstance
    if (instance1 == instance2) {
      println("相等~~~")
    }
  }
}

//SingleTon的构造方法私有化
class SingleTon2 private() {}

object SingleTon2 {
  private val s: SingleTon2 = new SingleTon2
  //饿汉式
  def getInstance: SingleTon2 = {
    s
  }
}
