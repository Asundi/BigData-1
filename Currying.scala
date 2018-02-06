
//Currying execute on eclispe


object TestCurry{
 
    //def addInt(a : Int,b : Int)= { a+b}
    def addInt(a:Int)= {(b :Int) => a+b}
}


object MainCurry {
  def main(args : Array[String]): Unit = {
  
    val x= TestCurry.addInt(10)(20)
	println(x)
  }
  }