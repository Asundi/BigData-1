object MyObject{
  def test(): Unit ={
    println("test message")
  }
}
//object - static in csharp,singleton

object TestMyClass2 {
  def main (args : Array[String]): Unit ={
   MyObject.test()
}
}