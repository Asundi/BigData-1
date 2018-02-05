class MyClass (private val name : String,private val age: Int) /* primary constructor */ {
  
  // auxiliary constructor
  //object TestMyClass {
  //def main (args : Array[String]): Unit ={
  //println("some message")
  //def this (name: String){
   // this(name,100)
  //}
  
  
  def test():Unit ={
    println(name + " " + age)
  }
}



object TestMyClass {
  def main (args : Array[String]): Unit ={
    val n =new MyClass("Test",18)
    n.test()
    
    
  //  val m1=new MyClass("Test1")
   // m1.test()
    
    
    //some message printed twice since myclass is instanciated twice
   // println(n.name +" "+n.age)
  }
}