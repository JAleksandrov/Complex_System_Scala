val t2 = System.nanoTime
val reviews = sqlContext.sql("SELECT * FROM reviews") //selects the reviews dataset
println("Time taken to make query "+(System.nanoTime - t2) / 1e9d)

val t3 = System.nanoTime
val reviews_with_count = reviews.groupBy("gplusplaceid").count // dataframe is stored which groups by the gplusplaceid and shows the count of reviews made by the person
println("Time taken to group by field and count "+(System.nanoTime - t3) / 1e9d)

val t4 = System.nanoTime
val filtered_reviews = reviews_with_count.filter("count > 3") // filter is applied to view only reviews that are made more than 3 times.

println("Time taken to filter the dataframe over 3 reviews "+(System.nanoTime - t4) / 1e9d)


val t5 = System.nanoTime
filtered_reviews.show() // dataframe is displayed

println("Time taken to display dataframe "+(System.nanoTime - t5) / 1e9d)


System.exit(0) // scala function is closed.
