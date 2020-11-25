package net.codeshow.arrayBufferDemo

object MultiArray {
  def main(args: Array[String]): Unit = {
    //3行4列的二维数组
    val arr = Array.ofDim[Int](3, 4)
    //遍历
    for (item <- arr) {
      for (i <- item) {
        print(i + "\t")
      }
      println()
    }
    println("---取出指定元素---")
    //取出指定的元素
    println(arr(1)(1))
    //修改值
    arr(1)(1) = 99
    //遍历
    for (item <- arr) {
      for (i <- item) {
        print(i + "\t")
      }
      println()
    }
    println("---传统的下标的方式遍历")
    for (i <- arr.indices) {
      for (j <- arr(i).indices) {
        printf("arr[%d][%d]=%d\t", i, j, arr(i)(j))

      }
      println()
    }

  }

}
