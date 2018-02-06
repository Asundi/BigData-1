//partially applied function  - fix one arfument and pass only the required arguement


val pf=(x: String,y:String) => x+y

val email=pf(_ :String ,"@godatafy.com")


email("Keerthan")
res0: String = Keerthan@godatafy.com
