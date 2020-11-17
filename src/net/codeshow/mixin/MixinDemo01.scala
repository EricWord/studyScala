package net.codeshow.mixin

//动态混入
object MixinDemo01 {
  def main(args: Array[String]): Unit = {
    //在不修改类的定义的基础上然让它们可以使用trait里的方法
    val oracleDB = new OracleDB with Operate
    oracleDB.insert(100)

    val mySQL = new MySQL3 with Operate
    mySQL.insert(999)

    //如果一个抽象类有抽象方法，该如何混入
    val mySQL3 = new MySQL3_ with Operate {
      override def say(): Unit = {
        println("say")
      }
    }
    mySQL3.insert(888)
    mySQL3.say()

  }

}

trait Operate {
  def insert(id: Int): Unit = {
    println("插入数据 = " + id)

  }
}

class OracleDB {

}

abstract class MySQL3 {

}

abstract class MySQL3_ {
  def say()

}