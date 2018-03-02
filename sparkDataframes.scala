import org.apache.spark.sql.SparkSession

 val spark = SparkSession.builder().appName("DataFrameExcercise").getOrCreate()
 
 
 val df_emps = spark.read.option("header","true").csv("D:\Training\Lynda - Scala Essential Training for Data Science\Exercise Files\Chapter 5\05_01\employee.txt")
 
 
 df_emps.take(10)
 
 
 df_emps.schema
 
 df_emps.show()
 
 
 
 
 //2nd dataframe
 
 
 
 val df_cr = spark.read.option("header","true").csv(":\Training\Lynda - Scala Essential Training for Data Science\Exercise Files\Chapter 5\05_01\country_region.txt")
 
 df_cr.take(10)
 
 df_cr.show()
 
 
 df_cr.columns
 
 
 
 val df_dd = spark.read.option("header","true").csv("/dept_div.txt")
 
 df_dd.show()
 
 
 df_emps.show()
 
 
 df_emps.createOrReplaceTempView("employees")
 
 
 val sqldf_emps = spark.sql("SELECT * FROM employees")
 
 
 val sqldf_emps_by_dept = spark.sql("SELECT department, count(*) FROM employees GROUP BY department")
 
 sqldf_emps_by_dept.show()
 
 
  val sqldf_emps_by_dept_gender = spark.sql("SELECT department,gender,count(*) FROM employees GROUP BY department,gender")
  
  sqldf_emps_by_dept_gender.show()
  
  
  val sqldf_depts = spark.sql("SELECT DISTINCT department FROM employees")
  
  sqldf_depts.show()
  
  
  
  val sqldf_emps_100 = saprk.sql("SELECT * FROM employees WHERE id < 100")
  
  sqldf_emps_100.show()
  
  
  //join dataframe
  
  val df_joined = df_emps.join(df_cr,"region_id")
  
  df_joined.columns
  
  df_emps.columns
  
  df_cr.columns
  
  df_joined.show()
  
  
  //working with json
  
  
  val spark = SparkSession.builder().appName("DataFrameExcercise").getOrCreate
  
  val df_json_dd =  spark.read.json("/dept_div.json")
  
    df_json_dd.show()
	
	
  
  
  
  
  
  
  
  
  
  
  