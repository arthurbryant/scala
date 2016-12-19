package custom 

class Point(var x: Int, var y: Int) {
  def move(dx: Int, dy: Int) {
    x += dx
    y += dy
  }

  override def toString: String = "(" + x + ", " + y + ")"
}
