object kadai1 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6)
    val evenList = list.filter(_ % 2 == 0)
    println(evenList)
  }
}
