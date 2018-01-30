//Higher order function 

//function whose return value is a function or

//function with a parameter that is a function



def compareStringAscending(s1:String,s2:String) :Int ={
 if(s1== s2) 0
 
 else if(s1 > s2) 1
 
 else {-1}

}

//compareStringAscending: (s1: String, s2: String)Int




def compareStringDescending(s1:String,s2:String) :Int ={
 if(s1== s2) 0
 
 else if(s1 > s2) -1
 
 else {1}

}

//compareStringDescending: (s1: String, s2: String)Int



// higher order function taking in compare function as arguement


def smartCompare(s1:String,s2:String ,cmpFn:(String,String) =>Int):Int ={
cmpFn(s1,s2)

}


//smartCompare: (s1: String, s2: String, cmpFn: (String, String) => Int)Int


//scala> smartCompare("abc","xyz",compareStringAscending)
//res0: Int = -1

//scala> smartCompare("abc","xyz",compareStringDescending)
//res1: Int = 1



//Higher order function with return value as function

def getComparator(reverse:Boolean) :(String,String) => Int ={

   if(reverse ==true) compareStringDescending
   else compareStringAscending

}

//getComparator: (reverse: Boolean)(String, String) => Int

//scala> val comparatorObject = getComparator(false)
//comparatorObject: (String, String) => Int = <function2>

//scala> val comparatorObject = getComparator(false)
//comparatorObject: (String, String) => Int = <function2>



