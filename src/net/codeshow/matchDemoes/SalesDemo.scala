package net.codeshow.matchDemoes

object SalesDemo {
  def main(args: Array[String]): Unit = {
    //这里给出了一个具体的打折的案例
    val sale = Bundle("书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30), Book("天龙八部", 100)))
    //使用case语句得到"漫画"
    val res = sale match {
      //如果我们进行对象匹配时，不想接受某些值，则使用_忽略即可，_*表示所有
      case Bundle(_, _, Book(desc, _), _*) => desc

    }
    println("res=" + res) //res=漫画

    //通过@表示法将嵌套的值绑定到变量
    val res2 = sale match {
      case Bundle(_, _, art@Book(_, _), rest@_*) => (art, rest)

    }
    println("res2=" + res2) //res2=(Book(漫画,40.0),Bundle(文学作品,20.0,ArraySeq(Book(《阳关》,80.0), Book(《围城》,30.0))))
    //不使用_*绑定剩余Item到rest

    val res3 = sale match {
      case Bundle(_, _, art@Book(_, _), rest) => (art, rest)

    }
    println("res3=" + res3) //res3=(Book(漫画,40.0),Bundle(文学作品,20.0,ArraySeq(Book(《阳关》,80.0), Book(《围城》,30.0))))
  }

  def price(it: Item): Double = {
    it match {
      case Book(_, p) => p
      case Bundle(_, disc, its@_*) => its.map(price).sum - disc
    }

  }

}

abstract class Item

case class Book(description: String, price: Double) extends Item

case class Bundle(description: String, discount: Double, item: Item*) extends Item
