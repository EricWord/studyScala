package net.codeshow.queueDemoes

import scala.collection.mutable

object QueueDemo01 {
  def main(args: Array[String]): Unit = {
    //创建队列
    val q1 = new mutable.Queue[Any]
    println(q1)//Queue()
    //向队列中增加单个元素
    q1 += 9
    println("q1:" + q1)//q1:Queue(9)

    q1 ++= List(4, 5, 7) //默认是追加到队列的末尾
    println("q1:" + q1)//q1:Queue(9, 4, 5, 7)

    q1 += List(10, 0) //这种方式表示将List(10,0)作为一个元素追加到q1中
    println("q1:" + q1)//q1:Queue(9, 4, 5, 7, List(10, 0))

  }

}
