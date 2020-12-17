package net.codeshow.viewBounds

object ViewBoundsDemo03 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person3("汤姆", 13)
    val p2 = new Person3("杰克", 10)
    //引入隐式函数
    import MyImplicit._
    val cc3 = new CommonCompare3(p1, p2)
    println(cc3.greater)


  }
}

class Person3(val name: String, val age: Int) {
  override def toString: String = this.name + "\t" + this.age

}


class CommonCompare3[T <% Ordered[T]](obj1: T, obj2: T) {
  def greater: T = if (obj1 > obj2) obj1 else obj2

  def greater2: T = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
