package net.codeshow.implicitDemo

//小结
//1.当在程序中，同时有 隐式值、默认值、传入的值
//2.编译器的优先级为 传入的值 > 隐式 > 默认值
//3.在隐式值匹配时，不能有二义性
//4.如果 隐式值、默认值、传入的值 都没有 会报错
object ImplicitValueDemo04 {
  def main(args: Array[String]): Unit = {
    //    implicit val name: String = "scala"
    //    implicit val name1: String = "world"  //隐式值不能有二义性

    def hello(implicit content: String = "jack"): Unit = {
      println("Hello," + content)

    }

    hello

    def hello2(implicit content: String = "jack"): Unit = {
      println("Hello2," + content)

    }

    hello2

    implicit val name2: Int = 10

    def hello3(implicit content: String = "jack"): Unit = {
      println("Hello3," + content)

    }

    hello3

    //当没有隐式值，没有默认值，有没有传入值
    def hello4(implicit content: String): Unit = {
      println("Hello4," + content)

    }

    //    hello4//报错
  }

}
