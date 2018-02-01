//Higher order methods replace for loop and gluee functions and collections

// Map,ForEach,Filter -  Act on One element at a time


// Scan ,Fold,REDUCE - Act on multiple elements at a time

val weekDays = List("Mon","Tue","Wed","tHU","fRI")
//weekDays: List[String] = List(Mon, Tue, Wed, tHU, fRI)

weekDays.foreach(println(_))
//Mon
//Tue
//Wed
//tHU
//fRI



weekDays.map(_=="Mon")
//res3: List[Boolean] = List(true, false, false, false, false)

val IsManicMonday =(x:String) => {x=="Mon"}:Boolean
//IsManicMonday: String => Boolean = <function1>

weekDays.map(IsManicMonday)


weekDays.sortBy(_(0))
//res9: List[String] = List(Mon, Tue, Wed, fRI, tHU)




//

val someNumbers=List(10,20,30,40,50,60)
//someNumbers: List[Int] = List(10, 20, 30, 40, 50, 60)



someNumbers.scanRight(0) (_-_)
//res10: List[Int] = List(-30, 40, -20, 50, -10, 60, 0)




//fold return only last element of result set

someNumbers.foldLeft(0)(_ - _) 

//res11: Int = -210


someNumbers.foldRight(0)(_ - _)
//res12: Int = -30



// 1 parameter is a function object returned single value 

someNumbers.reduceRight(_ - _)

//res13: Int = -30


someNumbers.reduceLeft(_ - _)
//res14: Int = -190





