package net.codeshow.covariantDemoes

object CovariantDemo01 {
  def main(args: Array[String]): Unit = {
    val t1: Temp3[Sub] = new Temp3[Sub]("hello")
    //    val t2: Temp3[Sub] = new Temp3[Super]("hello") 错误
    //    val t2: Temp3[Super] = new Temp3[Sub]("hello") 错误

    val t4: Temp4[Sub] = new Temp4[Sub]("hello")
    val t5: Temp4[Super] = new Temp4[Sub]("hello")
    //    val t6: Temp4[Sub] = new Temp4[Super]("hello") //错误

    val t7: Temp5[Sub] = new Temp5[Sub]("hello")
    val t8: Temp5[Sub] = new Temp5[Super]("hello")
    //    val t9: Temp5[Super] = new Temp5[Sub]("hello") 错误

  }

}

//不变
class Temp3[A](title: String) {
  override def toString: String = {
    title
  }
}

class Temp4[+A](title: String) {
  override def toString: String = {
    title
  }
}

//逆变
class Temp5[-A](title: String) {
  override def toString: String = {
    title
  }
}

//支持协边
class Super //父类
//sub是super的子类
class Sub extends Super