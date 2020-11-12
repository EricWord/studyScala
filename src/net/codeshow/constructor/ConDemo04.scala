package net.codeshow.constructor

object ConDemo04 {
  def main(args: Array[String]): Unit = {
    val worker = new Worker("smith")
    //worker.name//不能访问inName

    val worker2 = new Worker2("smith2")
    //    worker2.inName

    val worker3 = new Worker3("jack")
  }

}

//如果主构造器是Worker(inName: String)，inName则是一个局部变量
class Worker(inName: String) {
  var name = inName
}

//如下形式定义类，inName是类内只读的私有属性
class Worker2(val inName: String) {
  var name = inName

}

//如下定义的话inName是一个private的可以读写的属性
class Worker3(var inName: String) {
  var name = inName

}

