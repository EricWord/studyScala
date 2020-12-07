package net.codeshow.matchDemoes

object MatchObject2 {
  def main(args: Array[String]): Unit = {
    val nameString = "Alice,Bob,Thomas"

    nameString match {
      //当执行 case Names(first, second, third)
      //1.会调用unapplySeq(str)方法，把"Alice,Bob,Thomas" 传入给 str
      //2.如果返回的是Some("Alice","Bob","Thomas") 分别给(first, second, third)
        //注意这里返回的值的个数要和(first, second, third) 保持一致
      case Names(first, second, third) => {
        println("the string contains three  people's names")
        println(s"$first $second $third")
      }
      case _ => println("nothing matched")
    }

  }

}

object Names {
  //当构造器是多个参数时，就会触发这个对象提取器
  def unapplySeq(str: String): Option[Seq[String]] = {
    if (str.contains(",")) Some(str.split(","))
    else None
  }
}
