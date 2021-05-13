def findPhrases(rowStr: String): List[String] = { // function which splits into 3 words
  val cols = rowStr.split("\\s+") //splits into columns
  var list = List[String]() // init the list variable
  for (i <- 0 until cols.length - 2) { // for loops the column length
    list = cols.slice(i, i + 3).mkString(" ") :: list // adds to list the column slice of word
  }
  list //returns the list 
}

println("Enter rating : ") // prints to user to enter rating
val rating = Console.readDouble() // takes input from console and stores to double

val t2 = System.nanoTime
val df = (sqlContext.sql("SELECT * FROM reviews") // fetches the SQL query of all reviews
.filter($"rating" === rating) // filters ratings field to the stored user value
.flatMap(row => findPhrases(row.getAs[String]("reviewtext"))) // flatmap is used to the function to get the three words
.toDF("phrase") // converts to dataframe
.groupBy("phrase") // grouped by the phrase field
.count().orderBy($"count".desc) // sorted by descending order from highest value to lowest
.limit(20) //shows top 20
)
println("Time taken to make query "+(System.nanoTime - t2) / 1e9d)


val t3 = System.nanoTime
df.show() // display the dataframe
println("Time taken to display dataframe "+(System.nanoTime - t3) / 1e9d)

System.exit(0) // exit the scala function
