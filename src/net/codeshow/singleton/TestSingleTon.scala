package net.codeshow.singleton

object TestSingleTon {
  def main(args: Array[String]): Unit = {
    val instance1 = SingleTon.getInstance
    val instance2 = SingleTon.getInstance
    if (instance1 == instance2) {
      println("相等")
    }
  }
}

//SingleTon的构造方法私有化
class SingleTon private() {}

object SingleTon {
  private var s: SingleTon = null
  //懒汉式
  def getInstance = {
    if (s == null) {
      s = new SingleTon
    }
    s
  }
}
