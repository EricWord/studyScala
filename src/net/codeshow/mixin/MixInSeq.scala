package net.codeshow.mixin

object MixInSeq {
  def main(args: Array[String]): Unit = {

    val ff = new FF()

  }

}

trait AA {
  println("A...")
}

trait BB extends AA {
  println("B...")
}

trait CC extends BB {
  println("C...")
}

trait DD extends BB {
  println("D...")
}

class EE {
  println("E...")
}

class FF extends EE with CC with DD {
  println("F...")
}

class KK extends EE {
  println("K...")
}


