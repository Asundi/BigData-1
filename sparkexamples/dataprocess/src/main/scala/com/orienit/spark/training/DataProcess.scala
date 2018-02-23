package com.orienit.spark.training.data


 class DataProcess {
   
  def returnHikePercentList():Map[Int,Double]={
    val p:Map[Int,Double] = Map(1001 -> 10.00,
                            1002 -> 20.00,
						              	1003 -> 7.25,
							              1004 -> 6.50,
							              1005 -> 30.00)
				  p
  }
 }

class Set{
  val d =new DataProcess()
  
  d.returnHikePercentList()
}