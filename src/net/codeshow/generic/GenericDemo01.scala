package net.codeshow.generic

object GenericDemo01 {
  def main(args: Array[String]): Unit = {
    val intMessage = new IntMessage[Int](10)
    println("intMessage=" + intMessage)
    val strMesage = new StringMessage[String]("20")
    println("strMesage=" + strMesage)
  }
}

abstract class Message[T](s: T) {
  def get: T = s
}

class IntMessage[Int](v: Int) extends Message(v)

class StringMessage[String](v: String) extends Message(v)
