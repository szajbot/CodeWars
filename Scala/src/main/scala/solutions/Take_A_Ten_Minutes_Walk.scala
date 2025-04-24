package solutions

object Take_A_Ten_Minutes_Walk {
  def takeATenMinutesWalk(walk: Seq[Char]): Boolean = {
    val walkingMap = walk.sorted.groupBy(identity).mapValues(_.size)
    if (walkingMap.get('n') == walkingMap.get('s') && walkingMap.get('w') == walkingMap.get('e') && walk.length == 10) {
      return true
    }
    false
  }
}
