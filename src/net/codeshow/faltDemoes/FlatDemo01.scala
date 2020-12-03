package net.codeshow.faltDemoes

//扁平化
object FlatDemo01 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")
    val names2 = names.map(_.toUpperCase())
    println("names2:" + names2) //names2:List(ALICE, BOB, NICK)
    //扁平化操作
    val names3 = names.flatMap(_.toUpperCase())
    println("names3:" + names3) //names3:List(A, L, I, C, E, B, O, B, N, I, C, K)
  }
}
