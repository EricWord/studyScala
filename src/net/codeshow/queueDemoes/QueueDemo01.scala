package net.codeshow.queueDemoes

import scala.collection.mutable

object QueueDemo01 {
  def main(args: Array[String]): Unit = {
    //创建队列
    val q1 = new mutable.Queue[Any]
    println(q1) //Queue()
    //向队列中增加单个元素
    q1 += 9
    println("q1:" + q1) //q1:Queue(9)

    q1 ++= List(4, 5, 7) //默认是追加到队列的末尾
    println("q1:" + q1) //q1:Queue(9, 4, 5, 7)

    q1 += List(10, 0) //这种方式表示将List(10,0)作为一个元素追加到q1中
    println("q1:" + q1) //q1:Queue(9, 4, 5, 7, List(10, 0))
    //从队列中取出一个元素
    val value = q1.dequeue()
    println("value=" + value)
    println("q1:" + q1)
    //入队列，默认是从队列的尾部加入
    q1.enqueue(100, 991, 100, 888)
    println("q1:" + q1)

    //返回队列的元素
    //1.获取队列的第一个元素
    println("q1.head:" + q1.head)

    //2.获取队列的最后一个元素
    println("q1.last:" + q1.last)
    //3.取出队尾的数据，即:返回除了第一个以外的剩余的元素
    println("q1.tail:" + q1.tail)
    println("q1.tail:" + q1.tail.tail.tail)//可以连续取tail(级联使用)


  }

}
