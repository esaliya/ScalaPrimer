package scalabyexample.chapter4

object ConditionalExpressions {
  /* if-else is an expression, not a statement*/


  // Note, you need to have = before method body to indicate
  // it returns a value
  def abs(x: Double) =  if (x >= 0) x else -x

  // verbose and return keyword is redundant
  def abs2(x: Double): Double = { if (x >= 0) return x else return -x}
  // with "return"s gone works correct as abs
  def abs22(x: Double): Double = { if (x >= 0) x else -x}

  // Will give an error as we have explicit return keyword,
  // but no return type defined in signature
  /*def abs3(x: Double) = { if (x >= 0) return x else return -x}*/

  // abs3 return keyword is redundant. It'll always return (),
  // because no = sign before method body
  def abs3(x: Double) { if (x >= 0)  return x else  return -x}

  // Same as above, will return () always and
  // x and -x become useless expressions
  def abs4(x: Double) { if (x >= 0)  x else   -x}

  // Will work correct and is as same as abs.
  // Note the = sign before method body
  def abs5(x: Double) = { if (x >= 0)  x else -x}

  def main(args: Array[String]) {
    val x = -3
    println(abs(x))
  }




}
