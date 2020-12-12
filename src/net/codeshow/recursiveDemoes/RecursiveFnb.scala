package net.codeshow.recursiveDemoes

object RecursiveFnb {
  def main(args: Array[String]): Unit = {
    println(fbn(3))

  }

  def fbn(n: BigInt): BigInt = {
    if (n == 1 || n == 2) 1
    else fbn(n - 1) + fbn(n - 2)
  }

}
