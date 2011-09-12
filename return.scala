def makeRowSeq(row: Int) = 
  for (i <- 1 to 10) yield {
    val prod = (row * i).toString
    val padding = " " * (4 - prod.length)
    prod + padding 
}
def makeRow(row: Int) = makeRowSeq(row).mkString

def multiTable() = {
  val tableSeq = 
    for(i <- 1 to 10)
    yield makeRow(i)
  tableSeq.mkString("\n")
}
val r = multiTable()
println(r)
