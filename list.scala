val thrill = "past" :: "now" :: "now" :: "future" :: Nil
println(thrill)
val b = thrill.count(s => s.length == 3)
println(b)
