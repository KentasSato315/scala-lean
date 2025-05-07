object EitherExample {
  def main(args: Array[String]): Unit = {
    def checkAge(age: Int): Either[String, String] = {
      if (age >= 20) Right("二十歳以上を確認しました！")
      else Left(s" $age 際ではまだ飲酒はできません")
    }

    println(checkAge(25))
    println(checkAge(18))

    def safeDivide(a: Int, b: Int): Either[String, Int] =
      if (b == 0) Left("0では割れません")
      else Right(a / b)

    val result = safeDivide(10, 0)
      .map(_ * 2)
      .getOrElse(-1) // 失敗しているので-1を返す

    println(result) // -1
  }
}
