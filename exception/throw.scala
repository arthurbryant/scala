object Boom extends App {
    def boom(x: Int): Int = {
      if(x == 0) throw new Exception("boom")
      else {
        println(x)
        boom(x-1)
      }
    }
}

Boom.boom(10)
