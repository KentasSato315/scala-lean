import scala.util.Try

object TryExample {
  def main(args: Array[String]): Unit = {

    def parseInt(s: String): Try[Int] = Try(s.toInt)

    val value = parseInt("100").map(_ * 2).getOrElse(-1)
    println(value) // => 200

    val failed = parseInt("abc").map(_ * 2).getOrElse(-1)
    println(failed) // => -1

    val recovered = parseInt("abc").recover {
      case _: NumberFormatException => 999
    }
    println(recovered) // => Success(999)

    def unsafeDivide(a: Int, b: Int): Try[Int] = Try(a / b)
    def fallbackDivide(): Try[Int] = Try(10 / 2) // 安全な代替処理

    val result = unsafeDivide(10, 0).recoverWith {
      case _: ArithmeticException => fallbackDivide()
    }

    println(result) // => Success(5)
  }
}
