package net.codeshow.traitDemoes

object TraitDemo03 {
  def main(args: Array[String]): Unit = {
    println("~~~")
    //创建sheep
    val sheep = new Sheep
    sheep.sayHi()
    //    sheep.sayHello()
  }

}

//当一个trait有抽象方法和非抽象方法时
//1.一个trait在底层对应两个Trait.class接口
//2.还对应Trait03$class.class(抽象类)
trait Trait03 {
  //抽象方法
  def sayHi()

  //实现普通方法
  //  def sayHello(): Unit ={
  //    println("say Hello~~")
  //  }
}

//当trait有接口和抽象类时
//class Sheep extends Trait03 在底层对应
//class Sheep implements Trait03
//当在Sheep类中要使用Trait03的实现的方法，就通过Trait03$class来调用
class Sheep extends Trait03 {
  override def sayHi(): Unit = {
    println("小羊say hi~~~")
  }
}
