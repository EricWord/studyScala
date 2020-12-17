package net.codeshow.viewBounds

object ViewBoundsDemo02 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("tom", 10)
    val p2 = new Person("jack", 20)
    val compareComm2 = new CommonCompare2(p1, p2)
    println(compareComm2.greater2.name)

    val cat1 = new Cat("smith")
    val cat2 = new Cat("tom")
    println("xx"+new CommonCompare2(cat1, cat2).greater.name)


  }
}

class Person(val name: String, val age: Int) extends Ordered[Person] {
  override def compare(that: Person): Int = this.age - that.age

  override def toString: String = this.name + "\t" + this.age

}

//比较cat的名字的长度的大小
class Cat(val name: String) extends Ordered[Cat] {
  override def compare(that: Cat): Int = {
    this.name.length - that.name.length

  }
}

class CommonCompare2[T <% Ordered[T]](obj1: T, obj2: T) {
  def greater: T = if (obj1 > obj2) obj1 else obj2

  def greater2: T = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
