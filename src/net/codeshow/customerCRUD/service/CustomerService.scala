package net.codeshow.customerCRUD.service

import net.codeshow.customerCRUD.bean.Customer

import scala.collection.mutable.ArrayBuffer
import util.control.Breaks._

class CustomerService {

  var customerNum = 1
  //存放客户
  val customers: ArrayBuffer[Customer] = ArrayBuffer(new Customer(1, "tom", '男', 10, "110", "tom@163.com"))

  def list(): ArrayBuffer[Customer] = {
    this.customers
  }

  def add(customer: Customer): Boolean = {
    //设置id
    customerNum += 1
    customer.id = customerNum
    //加入到ArrayBuffer
    customers.append(customer)
    true
  }

  //根据id找到index
  def findIdByIndex(id: Int): Int = {
    var index = -1
    //遍历customers

    breakable {
      for (i <- customers.indices) {
        if (customers(i).id == id) {
          index = i
          break()
        }

      }
    }
    index

  }

  def del(id: Int): Boolean = {
    val index = findIdByIndex(id)
    if (index == -1) {
      return false

    }
    customers.remove(index)
    true
  }

}
