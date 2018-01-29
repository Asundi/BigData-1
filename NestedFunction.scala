//Nested Methods

val radius =10.0



def getCircleStats(r :Double) = {
 val PI=3.14
 def getCircleArea(r:Double) =PI*r*r
 def getCircleCircumference(r:Double) =2 *PI*r
 
 (getCircleArea(r),getCircleCircumference(r))
 
 //returns tuple

}


//getCircleStats: (r: Double)(Double, Double)



//scala> getCircleStats(10)
//res0: (Double, Double) = (314.0,628.0)
