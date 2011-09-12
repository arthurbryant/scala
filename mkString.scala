val n = 
  for(i <- 1 to 10) yield 
  i.toString
val r = n.mkString("\n")
println(r)
