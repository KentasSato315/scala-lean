object kadai3 {
  def main(args: Array[String]): Unit = {
    printEvenOrOdd(2)
    printEvenOrOdd(3)
  }

  private def evenOption(n: Int): Option[Int] = {
    if (n % 2 == 0) Some(n)
    else None
  }

  private def printEvenOrOdd(n: Int): Unit = {
    evenOption(n) match {
      case Some(x) => println("偶数です：" + x)
      case None => println("奇数でした")
    }
  }
}
