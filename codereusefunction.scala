//parameter default values


//type parameters - generics concept

//partially applied functions - function overloading


//currying - logically grouping parameters and specifying only few of them




//parameter default


def getCircleStats(PI:Double =3.14,r:Double)={

 def getCircleArea(r:Double) =PI*r*r
 def getCircleCircumference(r:Double)=2 *PI* r*r
 (getCircleArea(r),getCircleCircumference(r))

}

//getCircleStats: (PI: Double, r: Double)(Double, Double)

//scala> getCircleStats(r=10)
//res3: (Double, Double) = (3140.0,6280.0)



//type parameters - in java List<string>, T ,types are specified in [] in scala , type parameters only for methods not for functions




//Partially applied functions -  Arity - means number of inputs arguments into a function


//Quaternary function  F(w,x,y,z) - a function with arity =4



def compareStringDescending(s1:String,s2:String) :Int ={
 if(s1== s2) 0
 
 else if(s1 > s2) -1
 
 else {1}

}


//compareStringDescending: (s1: String, s2: String)Int

def smartCompare(s1:String,s2:String ,cmpFn:(String,String) =>Int):Int ={
cmpFn(s1,s2)

} 

//smartCompare: (s1: String, s2: String, cmpFn: (String, String) => Int)Int

val defaultCompare =smartCompare(_:String,_:String,compareStringAscending)
//defaultCompare: (String, String) => Int = <function2>


//scala> defaultCompare("abc","xy")
//res7: Int = -1



//Currying

//  multiple pairs of parentheses  








