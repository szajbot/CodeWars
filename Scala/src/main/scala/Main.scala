import solutions.Create_Phone_Number
import solutions.Primes_In_Numbers
import solutions.Sudoku_Board_Validator

object Main {
  def main(args: Array[String]): Unit = {
    val result = Sudoku_Board_Validator.validateSudoku(Array(Array(8,4,7,2,6,5,1,0,3),
      Array(1,3,6,7,0,8,2,4,5),
      Array(0,5,2,1,4,3,8,6,7),
      Array(4,2,0,6,7,1,5,3,8),
      Array(6,7,8,5,3,2,0,1,4),
      Array(3,1,5,4,8,0,7,2,6),
      Array(5,6,4,0,1,7,3,8,2),
      Array(7,8,1,3,2,4,6,5,0),
      Array(2,0,3,8,5,6,4,7,1)))

    println(result)
  }
}