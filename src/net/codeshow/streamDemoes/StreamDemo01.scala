package net.codeshow.streamDemoes

object StreamDemo01 {
  def main(args: Array[String]): Unit = {
    //创建stream
    def numsForm(n: BigInt): Stream[BigInt] = n #:: numsForm(n + 1)

    val stream1 = numsForm(1)
    println(stream1) //Stream(1, <not computed>)
    //取出第一个元素
    println("head=" + stream1.head) //head=1
    println(stream1.tail) //Stream(2, <not computed>)
    println(stream1) //Stream(1, 2, <not computed>)
  }

}
