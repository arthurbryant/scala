trait Tool {
  def changeDate(date: Any): Int = {
    def showDate(date: Any) {
      println("show date: " + date);
    }

    showDate(date)
    1
  }
}

object Method extends Tool {
  def main(args: Array[String]): Unit = {
    println("method")
    changeDate("20161220")
  }
}

Method.main(Array())
