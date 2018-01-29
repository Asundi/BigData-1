val PI=3.14
//PI: Double = 3.14


valr r=10

//r: Int = 10



def getCircleArea (r:Double):Double =PI *r*r

//getCircleArea: (r: Double)Double



val calcCircleArea= getCircleArea

//<console>:14: error: missing argument list for method getCircleArea
//Unapplied methods are only converted to functions when a function type is expected.
//You can make this conversion explicit by writing `getCircleArea _` or `getCircleArea(_)` instead of `getCircleArea`.
//       val calcCircleArea= getCircleArea




val calcCircleArea : (Double) => Double =getCircleArea

//calcCircleArea: Double => Double = <function1> 



scala> calcCircleArea(r)
//res0: Double = 314.0



val calcCircleArea =getCircleArea _

//calcCircleArea: Double => Double = <function1>

//_ IS a shortcut, take right and assign to left


scala> calcCircleArea(r)
//res1: Double = 314.0