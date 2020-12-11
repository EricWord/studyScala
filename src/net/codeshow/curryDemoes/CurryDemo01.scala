package net.codeshow.curryDemoes

object CurryDemo01 {
  def main(args: Array[String]): Unit = {

    def mulCurry(x: Int)(y: Int) = x * y
    println(mulCurry(10)(8))
  }
}
