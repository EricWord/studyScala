package net.codeshow.t1

object PrintDemo {
  def main(args: Array[String]): Unit = {
    var str1: String = "hello"
    var str2: String = " world"
    println(str1 + str2)
    var name: String = "tom"
    var age: Int = 10
    var sal: Float = 10.67f
    var height: Double = 180.15
    //    格式化输出
    printf("名字=%s 年龄是%d 薪水%.2f 身高%.3f", name, age, sal, height)
    //    scala支持使用$输出内容,编译器会解析对应的变量
    //    如果在字符串中出现变量的运算可以使用{}包裹
    println(s"个人信息如下:\n 名字$name \n 年龄$age \n 薪水$sal")

  }

}
