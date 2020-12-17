package net.codeshow.upperBounds

object UpperBoundsDemo01 {
  def main(args: Array[String]): Unit = {

    val compareInt = new CompareInt(10, 20)
    println(compareInt.greater)
    val commonCompare1 = new CommonCompare(Integer.valueOf(10), Integer.valueOf(20))
    println(commonCompare1.greater)

    val commonCompare2 = new CommonCompare(java.lang.Float.valueOf(1.1f), java.lang.Float.valueOf(2.1f))
    println(commonCompare2.greater)
    //上面的写法等价于下面的写法,使用了隐式转换
    val commonCompare3 = new CommonCompare[java.lang.Float](1.1f, 2.1f)
    println(commonCompare3.greater)
  }
}

//传统方法
class CompareInt(n1: Int, n2: Int) {
  //返回较大的值
  def greater: Int = if (n1 > n2) n1 else n2
}

//使用上界来完成
//1.[T <: Comparable[T]]表示传入的T类型是Comparable 子类型
//2.即传入的T类型要继承Comparable接口
//3.这样就可以直接使用compareTo方法
//4.使用上界的写法的通用性要比传统写法要好
class CommonCompare[T <: Comparable[T]](obj1: T, obj2: T) {
  def greater: T = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
