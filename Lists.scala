//Lists in scala


val weekDays2 ="Mon" ::"Tue" :: "Wed" :: "Thu" ::"Fri" :: Nil
//weekDays2: List[String] = List(Mon, Tue, Wed, Thu, Fri)



val weekDays= List("Mon","Tue","Wed","Thu","Fri")

//weekDays: List[String] = List(Mon, Tue, Wed, Thu, Fri)


val weekendDays =List("Sat","Sun")
//weekendDays: List[String] = List(Sat, Sun)


val days= weekDays ::: weekendDays
//days: List[String] = List(Mon, Tue, Wed, Thu, Fri, Sat, Sun)


val days = weekDays ++weekendDays
//days: List[String] = List(Mon, Tue, Wed, Thu, Fri, Sat, Sun)

val daysAgain= List(weekDays,weekendDays).flatten
//daysAgain: List[String] = List(Mon, Tue, Wed, Thu, Fri, Sat, Sun)


dayIndices zip dayIndices
//res3: List[(Int, Int)] = List((1,1), (2,2), (3,3), (4,4), (5,5), (6,6), (7,7))



weekDays.head
//res6: String = Mon

weekDays.tail
//res7: List[String] = List(Tue, Wed, Thu, Fri)

weekDays.size
//res8: Int = 5


weekDays.reverse
//res9: List[String] = List(Fri, Thu, Wed, Tue, Mon)


weekDays(1)
//res10: String = Tue

weekDays.contains("Mon")
//res12: Boolean = true


for(c <- weekDays) println(c)
//Mon
//Tue
//Wed
//Thu
//Fri


 