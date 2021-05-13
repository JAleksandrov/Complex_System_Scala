val word = readLine("Enter word: ")

val t2 = System.nanoTime
var review_df = sqlContext.sql("SELECT * FROM reviews")
println("Time taken to make query "+(System.nanoTime - t2) / 1e9d)


val t3 = System.nanoTime
var filtered_df = review_df.filter($"reviewtext".contains(word))
println("Time taken to make filter to the df "+(System.nanoTime - t3) / 1e9d)

print(word)

val t4 = System.nanoTime
filtered_df.foreach { row => // loops through the dataframe
  val gPlusPlaceId = row.mkString(",").split(",")(0)
  val gPlusUserId = row.mkString(",").split(",")(1) 
  print( gPlusPlaceId + "_" + gPlusUserId + "||") 
}

println("Time taken to display result "+(System.nanoTime - t4) / 1e9d)

System.exit(0) 

