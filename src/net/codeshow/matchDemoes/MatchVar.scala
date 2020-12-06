package net.codeshow.matchDemoes

object MatchVar {
  def main(args: Array[String]): Unit = {
    val ch = 'v'
    ch match {
      case '+' => println("ok~")
      case mychar => println("ok~" + mychar)
      case _ => println("ok~~")
    }
    val ch1 = '+'

    //match是一个表达式，因此可以有返回值
    //返回值就是匹配到的代码块的最后一句话的值
    val res = ch1 match {
      case '+' => ch1 + " hello"
      case _ => println("ok~")

    }
    println("res=" + res)
  }

}
