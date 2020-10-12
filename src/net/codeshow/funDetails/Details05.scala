package net.codeshow.funDetails

object Details05 {

  def main(args: Array[String]): Unit = {
    mysqlCon() //全部输出默认值
    println("----------------------")
    mysqlCon("127.0.0.1", 7777) //在只传部分参数的情况下，从左到右进行覆盖
    //如果只想覆盖第三个参数，前两个参数使用默认值，使用带名参数即可
    println("----------------------")
    mysqlCon(user = "tom", pwd = "123")


  }

  def mysqlCon(add: String = "localhost", port: Int = 3306, user: String = "root", pwd: String = "root"): Unit = {
    println("add=" + add)
    println("port=" + port)
    println("user=" + user)
    println("pwd=" + pwd)

  }

}
