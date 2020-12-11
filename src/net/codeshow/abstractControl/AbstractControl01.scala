package net.codeshow.abstractControl

object AbstractControl01 {
  def main(args: Array[String]): Unit = {

    //myRunInThread就是一个抽象控制
    //f1: () => Unit 这个函数是一个没有输入也没有输出的函数
    def myRunInThread(f1: () => Unit): Unit = {
      new Thread {
        override def run(): Unit = {
          f1()
        }
      }.start()
    }

    myRunInThread {
      () =>
        println("干活了，5秒完成...")
        Thread.sleep(5000)
        println("干完了!")
    }

    def myRunInThread2(f1: => Unit): Unit = {
      new Thread {
        override def run(): Unit = {
          f1
        }
      }.start()
    }
    //对于没有输入也没有返回值的函数，可以简写成如下形式
    myRunInThread2 {
      println("干活了，5秒完成...~~~")
      Thread.sleep(5000)
      println("干完了!~~")
    }
  }
}
