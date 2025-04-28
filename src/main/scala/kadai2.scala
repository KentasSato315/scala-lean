object kadai2 {
  def main(args: Array[String]): Unit = {
    println(kadai2.evenOption(2)) // → Some(2)
    println(kadai2.evenOption(3)) // → None
  }
  private def evenOption(n: Int): Option[Int] = {
    if (n % 2 == 0) Some(n)
    else None
  }
}
