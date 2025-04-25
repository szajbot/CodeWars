package solutions

import scala.collection.mutable.ListBuffer

object Sudoku_Board_Validator {
  def validateSudoku(board: Array[Array[Int]]): Boolean = {
    // box checking
    if (
        board(0).contains(0) ||
        board(1).contains(0) ||
        board(2).contains(0) ||
        board(3).contains(0) ||
        board(4).contains(0) ||
        board(5).contains(0) ||
        board(6).contains(0) ||
        board(7).contains(0) ||
        board(8).contains(0)
    ) {
      return false
    }

    if (
          !checkBox(0, 0, 2, 2, board) ||
          !checkBox(3, 0, 5, 2, board) ||
          !checkBox(6, 0, 8, 2, board) ||
          !checkBox(0, 2, 2, 5, board) ||
          !checkBox(3, 2, 5, 5, board) ||
          !checkBox(6, 2, 8, 5, board) ||
          !checkBox(0, 6, 2, 8, board) ||
          !checkBox(3, 6, 5, 8, board) ||
          !checkBox(6, 6, 8, 8, board)
      ) {
      return false
    }
    // cols checking
    for( colNumber <- 0 to 8){
      if (!checkCol(colNumber, board)) {
        return false
      }
    }
    // rows checking
    for(rowNumber <- 0 to 8){
      if (!checkRow(rowNumber, board)) {
        return false
      }
    }
    true
  }

  private def checkRow(rowNumber: Int, board: Array[Array[Int]]): Boolean = {
    val numbersInRow = new ListBuffer[Int]()
    for( col <- 0 to 8){
      numbersInRow.append(board(rowNumber)(col))
    }
    if (numbersInRow.groupBy(identity).size == 9) {
      return true
    }
    false
  }

  private def checkCol(colNumber: Int, board: Array[Array[Int]]): Boolean = {
    val numbersInCol = new ListBuffer[Int]()
    for( row <- 0 to 8){
      numbersInCol.append(board(row)(colNumber))
    }
    if (numbersInCol.groupBy(identity).size == 9) {
      return true
    }
    false
  }

  private def checkBox(startX: Int, startY: Int, endX: Int, endY: Int, board: Array[Array[Int]]): Boolean = {
    val numbersInBox = new ListBuffer[Int]()
    for( a <- startX to endX){
      for( b <- startY to endY){
        numbersInBox.append(board(a)(b))
      }
    }
    if (numbersInBox.groupBy(identity).size == 9) {
      return true
    }
    false
  }
}