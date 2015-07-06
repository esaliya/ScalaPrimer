package scalabyexample.chapter4

object CallbynameVsCallbyvalue {
  def constOne(cbvalParam: Int, cbnameParam: => Int) = 1

  def loop: Int = loop

  def main(args: Array[String]) {
    println(constOne(loop, 2)) // will NOT terminate
    println(constOne(2, loop)) // wil terminate and return 1
  }

}
