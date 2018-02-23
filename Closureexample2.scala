//closures are like self contained class - function and variables inside the function

def getComputation =(empID : Int) =>{
// employee with salary
 val e:Map[Int,Double] = Map(1001 -> 3500.00,
                            1002 -> 4300.00,
							1003 -> 2800.00,
							1004 -> 3000.00,
							1005 -> 4000.00)
 // employee id with percent hike 						
 val p:Map[Int,Double] = Map(1001 -> 10.00,
                            1002 -> 20.00,
							1003 -> 7.25,
							1004 -> 6.50,
							1005 -> 30.00)
 // anonymous function with closures
 (empID,e(empId) * p(empId) / 100.00)
							
}