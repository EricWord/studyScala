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


  }

}

//外部类
class ScalaOuterClass {

  class ScalaInnerClass { //成员内部类

  }

}

object ScalaOuterClass { //伴生对象
  class ScalaStaticInnerClass { //静态内部类

  }

}
