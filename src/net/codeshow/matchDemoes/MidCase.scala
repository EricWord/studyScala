package net.codeshow.matchDemoes

object MidCase {
  def main(args: Array[String]): Unit = {
    List(1, 3, 5, 9) match {
      //1.两个元素间::叫中置表达式，至少first和second两个匹配才行
      //2.first 匹配第一个second 匹配第二个，rest匹配剩余部分(5,9)
      case first :: second :: rest => println(first + " " + second + " " + rest.length + " " + rest)
      case _ => println("匹配不到...")
    }
  }
}
