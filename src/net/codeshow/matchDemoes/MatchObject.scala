package net.codeshow.matchDemoes

object MatchObject {
  def main(args: Array[String]): Unit = {
    val number: Double = 36.0
    number match {
      //case Square(n)运行机制说明
      //1.当匹配到case Square(n)，调用Square的unapply方法
      //2.z的值就是number
      //3.如果对象提取器unapply(z: Double)返回的是Some(6),则表示匹配成功
      //同时将6赋值给Square(n)中的n
        //如果返回
      case Square(n) => println("匹配成功,n=" + n)
      case _ => println("nothing matched")
    }

  }

}

object Square {
  //unapply是对象提取器
  //接收z: Double类型
  //返回类型是Option[Double]
  //返回的值是Some(math.sqrt(z)),返回z的开平方的值并放入到Some中
  def unapply(z: Double): Option[Double] = {
    println("unapply 被调用")
    Some(math.sqrt(z))
  }

  def apply(z: Double): Double = z * z
}
