package net.codeshow.parDemoes

object ParDemo01 {
  (1 to 5).foreach(println(_))
  println()
  //这里的输出结果是无序的
//  (1 to 5).par.foreach(println(_))//注意par需要单独引包
  val list = List(1, 2, 3, 4, 5)
//  list.par.map()

}
