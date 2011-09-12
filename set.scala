import scala.collection.mutable

val str = "See spot run. Run, Spot. Run"
val strArray = str.split("[ ,.!]+")
val words = mutable.Set.empty[String]
for (word <- strArray)
  words += word.toLowerCase
println(words)
