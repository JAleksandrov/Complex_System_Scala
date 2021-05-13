val t2 = System.nanoTime

val reviews_df = sqlContext.sql("SELECT * FROM reviews") // get the reviews and store to dataframe.
println("Time taken to make query "+(System.nanoTime - t2) / 1e9d)


val t3 = System.nanoTime

val final_df = reviews_df.groupBy("categories").avg("rating").orderBy($"avg(rating)".desc).limit(5) // firstly it categories by the categories and gets the average rating, then the list is sorted by rating in descending order from highest to lowest and the first 5 are shown.
println("Time taken to group by categories and fine the average and order by desc "+(System.nanoTime - t3) / 1e9d)

val t4 = System.nanoTime

final_df.show() //display the dataframe

println("Time taken to display dataframe "+(System.nanoTime - t4) / 1e9d)

System.exit(0) // exit the scala function
