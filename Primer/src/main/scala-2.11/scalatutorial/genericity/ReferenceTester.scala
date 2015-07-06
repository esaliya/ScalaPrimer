package scalatutorial.genericity

object ReferenceTester {
  def main(args: Array[String]) {
    val cell = new Reference[Int]
    cell.set(13)
    increment(cell)
    println(cell.get)
  }

  def increment(c: Reference[Int]) = c.set(c.get+1)

}
