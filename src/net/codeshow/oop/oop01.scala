package net.codeshow.oop

object oop01 {
  def main(args: Array[String]): Unit = {

    val cat = new Cat
    //给猫的属性赋值
    cat.name = "小白"
    cat.age = 10
    cat.color = "白色"
  }

}

class Cat {
  //当我们声明var变量时，对应底层是private访问类型，同时会生成对应的 变量名() 变量名
  var name: String = _ //注意需要赋初始值
  var age: Int = _ //下划线表示默认值
  var color: String = _
}
