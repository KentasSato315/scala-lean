package cupBook

import java.io.{File, FileNotFoundException, FileReader, IOException}
import java.net.{MalformedURLException, URL}

object list7_11_tryCatch {
  def main(args: Array[String]): Unit = {

    def urlFor(path: String) =
    try {
      new URL(path)
    } catch {
      case ex: MalformedURLException =>
        new URL("https://www.scala-lang.org")
    } finally {
      println("処理終了")
    }
  }
}
