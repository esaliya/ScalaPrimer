package scalatutorial

object Factorial {
  def fac(n: Long): Long = {
    if (n == 0) return 1
    n*fac(n - 1)
  }

  def main(args: Array[String]) {
    val n = 20
    println(fac(n))
  }

}
