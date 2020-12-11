package net.codeshow.closureDemoes

object ClosureDemo02 {
  def main(args: Array[String]): Unit = {
    val f = makeSuffix(".jpg")
    println(f("dog.jpg")) //dog.jpg
    println(f("cat")) //cat.jpg

  }


  def makeSuffix(suffix: String) = {
    //返回一个匿名函数，会使用到suffix
    (fileName: String) => {
      if (fileName.endsWith(suffix)) {
        fileName
      } else {
        fileName + suffix
      }
    }

  }

}
