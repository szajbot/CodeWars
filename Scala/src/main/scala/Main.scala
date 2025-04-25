import solutions.Create_Phone_Number
import solutions.Primes_In_Numbers

object Main {
  def main(args: Array[String]): Unit = {
    val phoneNumber = Primes_In_Numbers.primesInNumbers(7775460)
    println(phoneNumber)
  }
}