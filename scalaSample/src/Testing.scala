

class Test {
 Test.instanceCount += 1
}


object Test{
  var instanceCount: Int = 0
    def printMsg(): Unit = {
      
      
      println(instanceCount)
    }
}

object Main {
  def main(args : Array[String]): Unit = {
  
   for(i <- 1 to 10)
     new Test()
     
     Test.printMsg()
  }
  }