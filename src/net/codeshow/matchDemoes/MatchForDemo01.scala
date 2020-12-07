package net.codeshow.matchDemoes

object MatchForDemo01 {
  def main(args: Array[String]): Unit = {
    val map = Map("A" -> 1, "B" -> 0, "C" -> 3)
    for ((k, v) <- map) {
      println(k + " -> " + v)
    }
    println("------")
    for ((k, 0) <- map) {
      println(k + " --> " + 0)
    }
    println("------")
    //下面的这种用法更加灵活
    for ((k, v) <- map if v == 0) {
      println(k + " --> " + v)
    }
  }

}
