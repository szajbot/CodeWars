import solutions.Create_Phone_Number

object Main {
  def main(args: Array[String]): Unit = {
    val phoneNumber = Create_Phone_Number.createPhoneNumber(List(5, 9, 6, 6, 8, 7, 8, 3, 5, 1))
    println(phoneNumber)
  }
}