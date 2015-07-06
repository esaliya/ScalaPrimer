package scalabyexample.chapter4

object ExpressionsAndFunctions {
  def x = 1+2 // Will NOT evaluate 1+2 until x is used
  val y = 1+2 // Will evaluate 1+2

  def loop: Int = loop

  // verbose definition of a no arg no return function
  def printHelloVerbose():Unit = {
    println("Hello")
    ()
  }

  def printHelloWithNoExplicitReturn() {
    println("Hello")
  }

  def printHelloMinimal {
    println("Hello")
  }

  def main(args: Array[String]) {
    println(x)
  }

}
