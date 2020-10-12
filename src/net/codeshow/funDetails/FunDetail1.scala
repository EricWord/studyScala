package net.codeshow.funDetails

object FunDetail1 {
  def main(args: Array[String]): Unit = {
    //    形参列表和返回值列表的数据类型可以是值类型和引用类型
    val tigger = new Tigger
    val tigger1 = test01(10, tigger)
    println(tigger1.name)
    println(tigger.name)
    //   tigger和tigger1是同一个对象
    println(tigger == tigger1)
    println("tigger.hashCode()=" + tigger.hashCode())
    println("tigger1.hashCode()=" + tigger1.hashCode())


  }

  def test01(n1: Int, tigger: Tigger): Tigger = {
    println("n1=" + n1)
    tigger.name = "jack"
    tigger
  }

}

class Tigger {
  //  一个名字属性
  var name = ""
}
