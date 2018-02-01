//Mapss

val stateCodes=Map(
                   "Califorina" -> "CA",
                   "New York" -> "NY",
                   ("Vermont","VT")
                  )
				  
//stateCodes: scala.collection.immutable.Map[String,String] = Map(Califorina -> CA, New York -> NY, Vermont -> VT)



stateCodes("Vermont")
//res18: String = VT


stateCodes.contains("California")
//res19: Boolean = false


stateCodes.foreach((p:(String,String)) => println(p._1+ "=" +p._2))
//Califorina=CA
//New York=NY
//Vermont=VT


val states=List("California","New York","Vermont")
//states: List[String] = List(California, New York, Vermont)

val codes=List("CA","NY","VT")
//codes: List[String] = List(CA, NY, VT)


val stateCodes2 =(states zip codes).toMap
//stateCodes2: scala.collection.immutable.Map[String,String] = Map(California -> CA, New York -> NY, Vermont -> VT)


val states=stateCodes.keySet.toList
//states: List[String] = List(Califorina, New York, Vermont)


val codes=stateCodes.values.toList
//codes: List[String] = List(CA, NY, VT)




 