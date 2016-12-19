val r = """(\d+)""".r
val s = "--> 5 <---"
s match {
    case r(n) => println("This won't match")
      case _ => println("This will")
}
