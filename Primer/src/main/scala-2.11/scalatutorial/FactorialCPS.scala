package scalatutorial

object FactorialCPS {
  type Cont = Long => Long

  def fac(n: Long, k: Cont): Long = {
    if (n == 0) k(1) else fac(n-1, v => k(n*v))
  }

  def main(args: Array[String]) {
    val n = args.apply(0).toLong
    println(fac(n, v=>v))
  }

}
