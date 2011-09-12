val choice = if (args.length > 0) args(0) else ""
val result = choice match
{
  case "a" => "AAA"
  case "b" => "B"
case _ => "huh?"
}
println(result)
