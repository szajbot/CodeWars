package solutions

import scala.collection.mutable.ListBuffer

object Primes_In_Numbers {
  def primesInNumbers(m: Int): String = {
    def isPrime(n: Int): Boolean= (2 to (n - 1)).forall(n % _ != 0)
    val primes: Stream[Int] = 2 #:: Stream.from(3, 2).filter(isPrime)
    val primeNumbers = primes.take(1000)
    var result = ""
    var value = m
    var times = 0
    primeNumbers.reverse.foreach(prime => {
      times = 0
      if (value % prime == 0) {
        value = value / prime
        times = checkHowManyTimes(prime, value, 1)
      }
      if (times == 1) {
        result = "(" + prime + ")" + result
      } else if (times > 1) {
        result = "(" + prime + "**" + times + ")" + result
      }
    })
    result
  }

  def checkHowManyTimes(prime: Int, value: Int, times: Int): Int = {
    var howManyTimes = times
    var newVal = value
    if (value % prime == 0) {
      newVal = value / prime
      howManyTimes += 1
      howManyTimes = checkHowManyTimes(prime, newVal, howManyTimes)
    }
    howManyTimes
  }
}
