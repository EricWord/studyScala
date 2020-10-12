package net.codeshow.property

object prop01 {
  def main(args: Array[String]): Unit = {

    val p1 = new Person
    println("name=" + p1.Name)
    println("address=" + p1.address)
  }


}

class Person {
  var age: Int = 10
  var sal = 8090.9
  var Name = null
  var address: String = null

}
