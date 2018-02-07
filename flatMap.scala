//flatmap


val words = Array("Hi there", "How are you" , "Are you still there")

//words: Array[String] = Array(Hi there, How are you, Are you still there)

words.map(_.split(" "))

//res0: Array[Array[String]] = Array(Array(Hi, there), Array(How, are, you), Array(Are, you, still, there))
//array of array of words need to flat this



words.flatMap(_.split(" "))

//res1: Array[String] = Array(Hi, there, How, are, you, Are, you, still, there)
