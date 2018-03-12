13 lec//


read file

scala> val filename = "/D:/BD/data-master/retail_db/order_items/part-00000"
filename: String = /D:/BD/data-master/retail_db/order_items/part-00000

scala> val orderItems = Source.fromFile(filename)
orderItems: scala.io.BufferedSource = non-empty iterator


scala> orderItems.take(10).foreach(println)
1,1,957,1,299.98,299.98
2,2,1073,1,199.99,199.99
3,2,502,5,250.0,50.0
4,2,403,1,129.99,129.99
5,4,897,2,49.98,24.99
6,4,365,5,299.95,59.99
7,4,502,3,150.0,50.0
8,4,1014,4,199.92,49.98
9,5,957,1,299.98,299.98
10,5,365,5,299.95,59.99





import scala.io.Source
val orderItems3 = Source.fromFile("/D:/BD/data-master/retail_db/order_items/part-00000")
val orderItems3 = Source.fromFile("/D:/BD/data-master/retail_db/order_items/part-00000").getLines

val orderRevenue = orderItems3.filter(oi => oi.split(",")(1).toInt == 2).map (oi => oi.split(",")(4).toFloat).reduce((t,v) => t + v)