package net.codeshow.innerClass

import net.codeshow
import net.codeshow.innerClass

object ScalaInnerClassDemo {
  def main(args: Array[String]): Unit = {
    //创建两个外部类的实例
    val outer1: ScalaOuterClass = new ScalaOuterClass
    val outer2: ScalaOuterClass = new ScalaOuterClass
    //在scala中创建成员内部类的语法
    //默认情况下内部类实例和外部对象关联
    val scalaInnerClass1 = new outer1.ScalaInnerClass
    val scalaInnerClass2 = new outer2.ScalaInnerClass

    //创建静态内部类的实例
    val staticInner = new codeshow.innerClass.ScalaOuterClass.ScalaStaticInnerClass()
    scalaInnerClass1.info()
    scalaInnerClass1.test(scalaInnerClass1)
    //在默认情况下，scala的内部类的实例和创建该内部类实例的外部对象关联
    scalaInnerClass1.test(scalaInnerClass2)


  }

}

//外部类
class ScalaOuterClass {
  //这里可以这样理解， 外部类的别名  看做是外部类的实例
  myOuter =>

  class ScalaInnerClass { //成员内部类
    def info(): Unit = {
      println("name = " + myOuter.name + " sal = " + myOuter.sal)
    }

    //这里有一个方法，可以接受ScalaInnerClass实例
    //类型投影的作用:屏蔽外部对象对内部类的影响
    def test(ic: ScalaOuterClass#ScalaInnerClass): Unit = {
      println("使用了类型投影"+ic)

    }

  }

  //定义两个属性
  var name = "scoot"
  private var sal = 3000.9

}

object ScalaOuterClass { //伴生对象
  class ScalaStaticInnerClass { //静态内部类

  }

}
