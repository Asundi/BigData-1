//scala containers ,collections ,lists and maps

//options for error handling

//tuples - ordered containers (stored in order),implements traits tple1,tuple2

val personInfo =("Vitthal","Srinivasan",36,"M")

//personInfo: (String, String, Int, String) = (Vitthal,Srinivasan,36,M)


val genderPair = "Vitthal" -> "M"
//genderPair: (String, String) = (Vitthal,M)

// in order to apply function object to every item in tuple2 use productiterator


personInfo.productIterator.foreach{i => println("Value ="+i)}
//Value =Vitthal
//Value =Srinivasan
//Value =36
//Value =M


val(firstName,lastName,age,gender) = personInfo

//firstName: String = Vitthal
//lastName: String = Srinivasan
//age: Int = 36
//gender: String = M

def printPersonGender(name:String,gender:String) =println(s"Name:$name M/F:$gender")

//printPersonGender: (name: String, gender: String)Unit



(printPersonGender _) tupled(genderPair)
//Name:Vitthal M/F:M

personInfo.productArity
//res2: Int = 4