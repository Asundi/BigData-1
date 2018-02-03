package example

object Hello extends Greeting with App {
  println(greeting)
  
  def addInt(a :Int,b:Int):Int ={
    var sum=0
    
    sum=a+b
    
    return sum
    
  }
}

trait Greeting {
  lazy val greeting: String = "hello"
}
