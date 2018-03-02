scala> class Point2D(coord1:Int , coord2:Int){
     | var a: Int = coord1
     | var b: Int = coord2
     | def move(delta_a: Int , delta_b: Int){
     |  a = a+delta_a
     |  b = b+delta_b
     | }
     | }
defined class Point2D