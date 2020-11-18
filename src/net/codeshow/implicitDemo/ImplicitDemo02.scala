package net.codeshow.implicitDemo

object ImplicitDemo02 {
  def main(args: Array[String]): Unit = {

    //编写一个隐式函数，丰富mySQL功能
    implicit def addDelete(ms: MySQL): DB = {
      new DB

    }

    //创建MySQL对象
    val mySQL = new MySQL
    mySQL.insert()
    mySQL.delete()

  }

}

class MySQL {
  def insert(): Unit = {
    println("insert")
  }
}

class DB {
  def delete(): Unit = {
    println("delete")
  }
}
