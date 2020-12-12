package net.codeshow.customerCRUD.view

import net.codeshow.customerCRUD.bean.Customer
import net.codeshow.customerCRUD.service.CustomerService

import scala.io.StdIn
import util.control.Breaks._

class CustomerView {

  //定义一个循环变量，控制是否退出
  var loop = true

  //接收用户输入
  var key = ' '

  val customerService = new CustomerService


  def mainMenu(): Unit = {
    do {
      println("----------------客户信息管理软件----------------")
      println("                1 添加客户                     ")
      println("                2 修改客户                     ")
      println("                3 删除客户                     ")
      println("                4 客户列表                     ")
      println("                5 退出                        ")
      println("请选择(1-5):")
      key = StdIn.readChar()
      key match {
        case '1' => this.add()
        case '2' => println("修改客户")
        case '3' => this.del()
        case '4' => this.list()
        case '5' =>
          this.loop = false
          println("退出系统")
        case _ => println("非法输入")

      }

    } while (loop)
  }

  def list(): Unit = {
    println()
    println("----------------客户列表----------------")
    println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱")
    val customers = customerService.list()
    for (customer <- customers) {
      println(customer)
    }
    println("--------------客户列表完成--------------")
    println()
  }

  def add(): Unit = {
    println()
    println("----------------添加客户----------------")
    println("姓名:")
    val name = StdIn.readLine()
    println("性别:")
    val gender = StdIn.readChar()
    println("年龄:")
    val age = StdIn.readShort()
    println("电话:")
    val tel = StdIn.readLine()
    println("邮箱:")
    val email = StdIn.readLine()
    //构造对象
    val customer = new Customer(name, gender, age, tel, email)
    customerService.add(customer)
  }

  def del(): Unit = {
    println()
    println("----------------添加客户----------------")
    println("请选择待删除的客户编号(-1退出):")
    val id = StdIn.readInt()
    if (id == -1) {
      println("删除没有完成")
      return
    }
    println("确认是否删除(Y/N):")

    var choice = ' '

    breakable {
      do {
        choice = StdIn.readChar().toLower
        if (choice == 'y' || choice == 'n') {
          break()
        }
        println("确认是否删除")

      } while (true)
    }
    if (choice == 'y') {
      if (customerService.del(id)) {
        println("删除成功")
      } else {
        println("删除失败")
      }
    } else {
      println("放弃删除")
    }
  }

}
