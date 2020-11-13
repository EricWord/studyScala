package net.codeshow.abstractDemoes

object BankDemo {
  def main(args: Array[String]): Unit = {
    //开卡
    val account = new Account("gh00001", 890.4, "111111")
    account.query("111111")
    account.withDraw("111111", 100.0)
    account.query("111111")

  }

}

class Account(inAccount: String, inBalance: Double, inPwd: String) {
  private val accountNo: String = inAccount
  private var balance: Double = inBalance
  private val pwd: String = inPwd

  //查询
  def query(pwd: String): Unit = {
    if (!this.pwd.equals(pwd)) {
      println("密码错误")
      return
    }
    printf("账号为%s的用户当前余额为%.2f\n", this.accountNo, this.balance)
  }

  //取款
  def withDraw(pwd: String, money: Double): Any = {

    if (!this.inPwd.equals(pwd)) {
      println("密码错误")
      return
    }
    //判断取款金额是佛合理
    if (money > balance) {
      println("余额不足")
      return
    }
    this.balance -= money
    money
  }

}
