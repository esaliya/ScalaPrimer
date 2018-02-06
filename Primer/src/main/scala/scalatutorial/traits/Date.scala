package scalatutorial.traits

class Date (y: Int, m: Int, d: Int) extends Ord{

  def year = y
  def month = m
  def day = d

  override def <(that: Any): Boolean = {
    if (!that.isInstanceOf[Date])
      sys.error("cannot compare " + that + " and a Date")
    val o = that.asInstanceOf[Date]
    (this.year < o.year) ||
      (this.year == o.year && (this.month < o.month ||
        (this.month == o.month && this.day < o.day)))
  }

  override def toString: String = this.year + ""
  + this.month + ""
  + this.day

  override def equals(that: Any): Boolean =
    that.isInstanceOf[Date] && {
      val o = that.asInstanceOf[Date]
      o.day == this.day && o.month == this.month && o.year == this.year
    }
}
