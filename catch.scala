import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

var f = new FileReader("a.scala")
try
{
    println(f.read())
}
catch
{
  case ex: FileNotFoundException => println("file not found")
  case ex: IOException => println("io exception")
}
finally
{
    println("close file")
  f.close()
}
