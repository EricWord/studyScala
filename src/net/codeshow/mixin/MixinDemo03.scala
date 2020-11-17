package net.codeshow.mixin

object MixinDemo03 {
  def main(args: Array[String]): Unit = {
    //    println("xxx")

    val mySQL5 = new MySQL5 with DB5 with File5
    mySQL5.insert(666)
  }

}

trait Operate5 {
  def insert(id: Int)
}

trait File5 extends Operate5 {
  //如果在子特质中重写/实现了一个父特质的抽象方法，但是同时调用了super方法
  //这时重写的这个方法不是完全实现的，需要声明为 abstract override
  //这时super.insert(id)的调用就和动态混入顺序有密切关系
  abstract override def insert(id: Int): Unit = {
    println("将数据保存到文件中")
    super.insert(id)
  }
}

trait Temp06 extends File5 {

}

trait DB5 extends Operate5 {
  override def insert(id: Int): Unit = {
    println("将数据保存到数据库中...")
  }
}

class MySQL5 {}
