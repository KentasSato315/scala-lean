object OptionExample {
  def main(args: Array[String]): Unit = {

    def findUser(id: Int): Option[String] = {
      if (id == 1) {
        Some("Alice")
      } else {
        None
      }
    }

    val user = findUser(2)
    println(user.getOrElse("Unknown")) // => Alice

    user match {
      case Some(name) => println(s"Hello, $name!")
      case None => println("No name found.")
    }
  }
}
