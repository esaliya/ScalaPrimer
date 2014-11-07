import java.util.{Locale, Date}
import java.text.DateFormat
import java.text.DateFormat._

object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world!")
    val now = new Date()
    val df = getDateInstance(LONG, Locale.US)
    println(df format now) // equivalent to println(df.format(now))

    val ans = 1 + 2 * 3
    val eqAns = (1).+((2).*((3)))
    val eqAnsDouble = 1.+(2.*(3)) // but numbers interpreted as doubles due to longest match rule
    println(ans, eqAns, eqAnsDouble)
  }
}
