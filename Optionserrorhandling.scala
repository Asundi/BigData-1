def fraction(number:Double ,denom:Double) :Option[Double] ={
  if(denom ==0)
  None
  else
  Option(number/denom)
}

//fraction: (number: Double, denom: Double)Option[Double]


fraction(22,7)
//res21: Option[Double] = Some(3.142857142857143)


fraction(22,0)
//res22: Option[Double] = None


val pi= fraction (22,7) getOrElse "Oops,something went wrong"
//pi: Any = 3.142857142857143


val pi= fraction (22,0) getOrElse "Oops,something went wrong"
//pi: Any = Oops,something went wrong


 fraction(22,7) match
 { 
   case Some(pi) => pi
   case None => "Something bad happened"
   
 }
 
 //res23: Any = 3.142857142857143
 
 
  fraction(22,0) match
 { 
   case Some(pi) => pi
   case None => "Something bad happened"
   
 }
 
 
 //res25: Any = Something bad happened
 
 
 ///util.try(stateCode("NoSuchState")
 
 //util.Success
 //util.Failure
 
 