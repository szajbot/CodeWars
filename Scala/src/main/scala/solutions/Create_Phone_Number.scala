package solutions

object Create_Phone_Number {
  def createPhoneNumber(numbers: Seq[Int]) : String = {
    val result = new StringBuilder("(")
    for((x,i) <- numbers.view.zipWithIndex) {
      if (i == 3) {
        result ++= ") "
      }
      if (i == 6) {
        result ++= "-"
      }
      result ++= x.toString
    }
    result.result()
  }
}
