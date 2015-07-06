package scalatutorial.traits

object DateChecker {
  def main(args: Array[String]) {
    val d1: Date = new Date(2,3,4)
    val d2: Date = new Date(2,4,4)

    println(d1 < d2)

  }

}
