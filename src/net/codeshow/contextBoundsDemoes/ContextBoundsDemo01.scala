package net.codeshow.contextBoundsDemoes

object ContextBoundsDemo01 {

  implicit val personComparator = new Ordering[Person4] {
    override def compare(x: Person4, y: Person4): Int =
      x.age - y.age
  }

  def main(args: Array[String]): Unit = {
    val p1 = new Person4("mary", 30)
    val p2 = new Person4("smith", 35)
    val comm = new CompareComm4(p1, p2)
    println(comm.greatter)

    val comm2 = new CompareComm5(p1, p2)
    println(comm2.greatter)

    val comm3 = new CompareComm6(p1, p2)
    println(comm3.greatter)


  }

}

class Person4(val name: String, val age: Int) {
  override def toString: String = this.name + "\t" + this.age
}

//方式1
// [T: Ordering]泛型
//obj1: T, obj2: T 接收T类型的对象
//implicit comparetor: Ordering[T]是一个隐式参数
class CompareComm4[T: Ordering](obj1: T, obj2: T)(implicit comparetor: Ordering[T]) {
  def greatter = if (comparetor.compare(obj1, obj2) > 0) obj1 else obj2
}

//方式2
//将隐式参数放到方法内
class CompareComm5[T: Ordering](o1: T, o2: T) {
  def greatter = {
    def f1(implicit cmptor: Ordering[T]) = cmptor.compare(o1, o2)

    if (f1 > 0) o1 else o2
  }
}

//方式3
class CompareComm6[T: Ordering](o1: T, o2: T) {
  def greatter = {
    //这行代码会发生隐式转换，获取到隐式值
    val comparetor = implicitly[Ordering[T]]
    println("CompareComm6 comparetor" + comparetor.hashCode())
    if (comparetor.compare(o1, o2) > 0) o1 else o2
  }
}
