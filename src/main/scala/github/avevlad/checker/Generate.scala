package github.avevlad.checker

import java.io._

object Generate {
  def main(args: Array[String]) {
    val absolutePath = new File(".").getAbsolutePath()
    val writer = new PrintWriter(new File(absolutePath, "/base36.txt"))
    val untilNumber = 36 * 36 * 36
    for (x <- 36 * 36 until untilNumber) {
      val base36: String = java.lang.Long.toString(x, 36)
      var writeString = base36 + "\n"
      if (x == untilNumber - 1) {
        writeString = base36
      }
      writer.write(writeString)
      println(x, "     -     " + base36)
    }
    writer.close()
  }
}
