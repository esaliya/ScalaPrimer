package scalatutorial

import java.text.DateFormat._
import java.util.{Date, Locale}

object HelloWorld {
  def main (args: Array[String]) {
    println("Hello, " + args.apply(0) + "!")
    val now = new Date()
    val df = getDateInstance(LONG, Locale.ENGLISH)
    println(df format now)

    val com = new Complex(2,3)
    println(com.re() + " " + com.im())
    println(com)
    val comLite = new ComplexLite(4,6)
    println(comLite.re + " " + comLite.im)
  }
}
