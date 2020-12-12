package net.codeshow.customerCRUD.app

import net.codeshow.customerCRUD.view.CustomerView

object CustomerCrm {
  def main(args: Array[String]): Unit = {
    new CustomerView().mainMenu()
  }

}
