package net.codeshow.matchDemoes

object MatchIfDemo01 {
  def main(args: Array[String]): Unit = {
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
          //如果case后有 条件守卫即if,那么这时的_不是表示默认匹配
          //而是表示忽略传入的ch
        case _ if ch.toString.equals("3") => digit = 3
        case _ if ch > 10 => println("ch > 10")
        case _ => sign = 2
      }

      println(ch + " " + sign + " " + digit)
    }
  }

}
