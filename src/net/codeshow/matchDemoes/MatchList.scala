package net.codeshow.matchDemoes

object MatchList {
  def main(args: Array[String]): Unit = {
    for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(88), List(1, 0, 0))) {
      val result = list match {
        case 0 :: Nil => "0"
        case x :: y :: Nil => x + " " + y
        case x :: Nil => x
        case 0 :: tail => "0..."
        case _ => "something else"
      }
      println(result)
      //输出结果如下
      //      0
      //      1 0
      //      0...
      //      88
      //      something else
    }
  }
}
