package net.codeshow.importDetail

import java.beans.BeanProperty

import scala.collection.mutable

object TestImport {
  def main(args: Array[String]): Unit = {

  }

}

class User {
  @BeanProperty var name: String = ""

  def test(): Unit = {
    //可以使用选择器，选择引入包的内容
    import scala.collection.mutable.{HashMap, HashSet}
    var map = new HashMap()
    var set = new HashSet()
  }

  def test2(): Unit = {
    //下面的含义是将java.util.HashMap重命名为JavaHashMap
    import java.util.{HashMap => JavaHashMap, List}
    import scala.collection.mutable._
    //此时的HashMap指向的是scala中的HashMap
    var map = new mutable.HashMap()
    //此时使用的是java中的hashMap的别名
    var map1 = new JavaHashMap()
  }
}
