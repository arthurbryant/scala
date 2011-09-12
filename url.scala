import java.net.URL
import java.net.MalformedURLException

def forurl(url: String) = 
try
{
  new URL(url)
  println("success")
}
catch
{
    case e: MalformedURLException => println("url exception")
    new URL("http://www.scala-lang.org")
}

forurl("//w.g.cn")
