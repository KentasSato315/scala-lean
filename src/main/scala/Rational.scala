class Rational(n: Int, d: Int) {
  require(d != 0)
  // 「d が 0 じゃないこと」を条件としてチェックして、違反してたら例外を投げる
  // java.lang.IllegalArgumentException: requirement failedを発生
  // require(d != 0, "分母は0にできません")

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n
  val denom: Int = d

  def this(n: Int) = this(n, 1) // 補助コンストラクター

  override def toString = s"$n/$d"
  // Scalaではすべてのクラスは暗黙的に AnyRef を継承
  // AnyRefにはtoString: String というメソッドがある

  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  private def gcd(a: Int, b: Int): Int =
    if(b == 0) {
      a
    } else {
      gcd(b, a % b)
    }
}
