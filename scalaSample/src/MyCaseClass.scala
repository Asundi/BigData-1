
case class MyCaseClass(empId: Int,empName: String,empAddrs: String)
  
object Test32{
   def main(args : Array[String]): Unit = {
     
     val m1=new MyCaseClass(100,"Test1","SomeWhere1...")
     val m2=new MyCaseClass(200,"Test2","Somewhere2...")
     
     println(m1 ==m2)
     
     val m3=m1.copy()
     println(m3 == m1)
     
     println(m1)
     
   }
   
}