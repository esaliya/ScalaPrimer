package scalabyexample.chapter2

object QuickSortFunctional {
  def sort(xs: Array[Int]): Array[Int] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      Array.concat(
        sort(xs filter (pivot >)),
        xs filter (pivot ==),
        sort(xs filter (pivot <)))
    }
  }

  def main(args: Array[String]) {
    val array = Array(5,3,6,2,1,2,4)

    println(sort(array).mkString(" "))
  }


}
