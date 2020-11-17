package net.codeshow.mixin

//scala在叠加特质时，会首先从后面的特质开始执行(从左到右执行)
object MixinDemo02 {

  def main(args: Array[String]): Unit = {
//    val mysql = new MySQL4 with DB4 with File4
//    println(mysql)

    //执行一个动态混入的方法时，执行顺序
    //从右到左开始执行，当执行到super时，super是指其左边的特质
    //比如 val mysql = new MySQL4 with DB4 with File4
    //File4左边就是DB4
    //如果找不到才执行父类的方法，则super就是父特质
//    mysql.insert(99900)

    val mySQL4 = new MySQL4 with File4 with DB4
    mySQL4.insert(8989)

  }
}

trait Operate4 {
  println("Operate4...")

  def insert(id: Int)
}

trait Data4 extends Operate4 {
  println("Data4")

  override def insert(id: Int): Unit = {
    println("插入数据 = " + id)
  }
}

trait DB4 extends Data4 {
  println("DB4")

  override def insert(id: Int): Unit = {
    println("向数据库")
    super.insert(id)
  }
}


trait File4 extends Data4 {
  println("File4")

  override def insert(id: Int): Unit = {
    println("向文件")
    //这里super在动态混入时，不一定是父类
    //    super.insert(id)
    //如果希望直接调用Data4的insert方法，可以指定如下:
    //注意super[?] ?的类型必须是当前的特质的直接父特质(或者超类)
    super[Data4].insert(id)
  }
}

class MySQL4 {

}