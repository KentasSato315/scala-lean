package cupBook

import java.io.File

object list7_5_for {
  def main(args: Array[String]): Unit = {
    val filesHere = new File(".").listFiles
    for (file <- filesHere) {
      // file <- filesHere の構文はジェネレーターと呼ばれる
      // fileという名前の新しいvalがfilesHereの要素によって初期化される
      println(file)
    }

    // フィルターを追加する
    for (file <- filesHere if file.getName.endsWith(".scala"))
      println(file)
    // ↑と同じ
    for (file <- filesHere)
      if (file.getName.endsWith(".scala"))
        println(file)
    // フィルター追加したい場合ifを追加する
    for (
      file <- filesHere
      if file.isFile
      if file.getName.endsWith(".scala")
    ) println(file)
  }
}
