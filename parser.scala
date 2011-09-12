import scala.util.parsing.combinator._

class SimpleLanguageParser extends JavaTokenParsers {    
    def expr: Parser[Double] = (term ~ rep(("+" | "-") ~ term)) ^^ { 
            case a ~ lst =>  (a /: lst) { 
                      case (x, "+" ~ y) => x + y
                              case (x, "-" ~ y) => x - y
                                    }
                                        } 
                                          def term: Parser[Double] = (factor ~ rep(("*" | "/") ~ factor)) ^^ { 
                                                  case a ~ lst =>  (a /: lst) { 
                                                            case (x, "*" ~ y) => x * y
                                                                    case (x, "/" ~ y) => x / y
                                                                          }
                                                                              } 
                                                                                def factor: Parser[Double] = wholeNumber ^^ { _.toDouble } | "(" ~> expr <~ ")"
                                                                              }

                                                                              object Main {
                                                                                  def main(args : Array[String]) : Unit = {}
                                                                                    val parser = new SimpleLanguageParser
                                                                                      val result = parser.parse(parser.expr, "3 + 4 * 5")
                                                                                          println(result)       
                                                                                      }
