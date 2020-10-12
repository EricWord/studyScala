package net.codeshow.funDetails

object Details03 {
  def main(args: Array[String]): Unit = {
    def f1(): Unit = {
      println("f1")
    }

    println("ok~~")

    def sayOk(): Unit = {
      println("main inner sayOk")
    }
  }

  def sayOk(): Unit = {
    println("main out sayOk")
  }

}
