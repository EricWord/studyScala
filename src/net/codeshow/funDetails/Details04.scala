package net.codeshow.funDetails

object Details04 {

  def main(args: Array[String]): Unit = {

    println(sayOk("小明"))
  }

  //name形参的默认值为jack
  def sayOk(name: String = "jack"): String = {
    return name + " ok!"

  }

}
