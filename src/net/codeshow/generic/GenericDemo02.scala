package net.codeshow.generic

import net.codeshow.generic.SeasonEnum

object GenericDemo02 {
  def main(args: Array[String]): Unit = {
    //    new EnglishClass[SeasonEnum.SE,String,String](SeasonEnum.spring,"","")//这行代码报错
  }
}

class EnglishClass[A, B, C](val classSeason: A, val className: B, val classType: C)

//季节是枚举类型
class SeasonEnum extends Enumeration {
  type SE = Value
  val spring, autumn, summer, winter = Value
}
