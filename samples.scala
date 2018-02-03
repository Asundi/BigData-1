//Scala Samples https://www.youtube.com/watch?v=xNAD6cBKyaA

val str="Test"

//str: String = Test

str.foreach(println)

//T
//e
//s
//t

str.foreach(print)
//Test


for(c <-  1 to 5) println(c)

//1
//2
//3
//4
//5

for(i <- 5 to 1 by -1) println(i)

//5
//4
//3
//2
//1


for( i <-  1 to 5;j <- 1 to 4) println(s"($i,$j)")
//(1,1)
//(1,2)
//(1,3)
//(1,4)
//(2,1)
//(2,2)
//(2,3)
//(2,4)
//(3,1)
//(3,2)
//(3,3)
//(3,4)
//(4,1)
//(4,2)
//(4,3)
//(4,4)
//(5,1)
//(5,2)
//(5,3)
//(5,4)


//without guard condition

for(i <- 1 to 5; j <- 1 to 4)
{
 if(i == j)
  println(s"($i, $j)")
}


//(1, 1)
//(2, 2)
//(3, 3)
//(4, 4)


//with guard condition

for(i <- 1 to 5;j <- 1 to 4 if i ==j)
println(s"($i,$j)")

//(1,1)
//(2,2)
//(3,3)
//(4,4)


for( i <- 1 to 20 if i % 2 ==0) yield(i)
//res15: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)


//function
def areaRect(l:Float,b: Float): Float ={
          l*b
}

//areaRect: (l: Float, b: Float)Float


areaRect(10,9)
//res17: Float = 90.0

def evenOrNot(n: Int) : Boolean ={
n % 2 == 0
}


// set default arguement

def araeaRect(l:Int,b: Int =10): Int= { l* b}

//araeaRect: (l: Int, b: Int)Int

araeaRect(10)
//res28: Int = 100

// array fixed size , array buffer variable length


