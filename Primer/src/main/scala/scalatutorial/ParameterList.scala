package scalatutorial

/**
  * Saliya Ekanayake on 5/1/17.
  */
object ParameterList {
  def main(args: Array[String]): Unit = {
    var res = foo(10){
      giveMeAnInt()+1
    }
    println(res)

    // Also, we can do this
    res = foo(10)(20)
    println(res)
  }

  def foo(x: Int)(y: Int): Int = {
    x+y
  }

  def giveMeAnInt(): Int = {
    30
  }

}
