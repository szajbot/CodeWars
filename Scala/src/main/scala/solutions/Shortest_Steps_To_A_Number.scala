package solutions

object Shortest_Steps_To_A_Number {
  def shortestSteps(n: Int): Int = {
    var partialValue = n
    var steps = 0
    while (partialValue != 1) {
      if (partialValue % 2 == 0) {
        partialValue = partialValue / 2
        steps += 1
      } else {
        partialValue -= 1
        steps += 1
      }
    }
    steps
  }
}