package scalatutorial

object Timer {
  def oncePerSecond(callback: () => Unit): Unit ={
    while (true) {
      callback(); Thread sleep 1000
    }
  }

  def timeFlies(){
    println("time flies like an arrow")
  }

  def main(args: Array[String]) {
//    oncePerSecond(timeFlies)
    oncePerSecond(() => println("Using anonymous methods can take time too :)"))
  }

}
