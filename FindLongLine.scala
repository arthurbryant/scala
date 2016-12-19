object FindLongLine
{
  def main(args: Array[String]){
    val width = args(0).toInt
    for(arg <- args.drop(1))
      LongLine.processFile(arg, width)
  }
}
