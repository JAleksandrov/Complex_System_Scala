val t2 = System.nanoTime

val reviews_df = sqlContext.sql("SELECT * FROM reviews") // dataframe to get records

println("Time taken to make query "+(System.nanoTime - t2) / 1e9d)


val t3 = System.nanoTime

val final_df = reviews_df.groupBy("categories").avg("rating") // dataframe which is grouped by categories field which gives the count of the same categories and average value is is done on ratings.

println("Time taken to group by field and find the average for df "+(System.nanoTime - t3) / 1e9d)


val t4 = System.nanoTime
final_df.show() //display the dataframe
println("Time taken to display dataframe "+(System.nanoTime - t4) / 1e9d)


System.exit(0) // exit the scala function
