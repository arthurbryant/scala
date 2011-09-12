import scala.io.Source

object LongLine
{
	def processFile(file: String, width: Int) 
	{
	def processLine(line: String)
	{
	    if (line.length > width)
	      println(file+ ": " + line)
	}
	  val source = Source.fromFile(file)
	    for (line <- source.getLines)
	    {
	        processLine(line)
	    }
	}
}
  
