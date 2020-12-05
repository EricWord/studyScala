package net.codeshow.operator

object OperatorDemo01 {
  def main(args: Array[String]): Unit = {
    val n1 = 1
    val n2 = 2
    val r1 = n1 + n2
    val r2 = n1.+(n2)
    val monster = new Monster
    monster + 10
    monster.+(10)
    println("monster.money=" + monster.money)
    monster.++()
    println("monster.money=" + monster.money)
    !monster
    println("monster.money=" + monster.money)
  }
}

class Monster {
  var money: Int = 0
  //对操作符进行重载
  def +(n: Int): Unit = {
    this.money += n
  }

  def ++(): Unit = {
    this.money += 1
  }

  //取反
  def unary_!(): Unit = {
    this.money = -this.money
  }
}
