package net.codeshow


//创建一个包对象
//每一个包都可以有一个包对象，而且只能有一个，并且包对象的名称需要与子包一样
//在包对象中可以定义变量、方法
//在包对象中定义的变量和方法，就可以在对应的包中使用
package object packageDemoes {
  val name = "king"

  def sayHi(): Unit = {
    println("package object packageDemoes sayHi~")
  }


  object Test100 {
    def main(args: Array[String]): Unit = {
      //使用包中定义的变量
      println("使用name =" + name)
      //使用包中定义的方法
      sayHi()
    }
  }

  class User {
    def testUser(): Unit = {
      println("name = " + name)
      sayHi()
    }

  }

}


