package net.codeshow.mapOperateDemoes

object HighOrderFuncDemo02 {
  def main(args: Array[String]): Unit = {

    test2(sayOk)
  }

  //test2是一个高阶函数，可以接收一个 没有输入，返回为Unit的函数
  def test2(f: () => Unit): Unit = {
    f()
  }

  def sayOk(): Unit = {
    println("sayOKKKK....")
  }

}
