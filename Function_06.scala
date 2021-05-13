val t2 = System.nanoTime
val reviews = sqlContext.sql("SELECT * FROM reviews") // Get the Reviews dataframe
println("Time taken to make query reviews "+(System.nanoTime - t2) / 1e9d)

val t3 = System.nanoTime
val it_specialists = sqlContext.sql("SELECT * FROM users WHERE jobs = 'IT Specialist'") // Get IT specialists query

println("Time taken to make query it specialists "+(System.nanoTime - t3) / 1e9d)


val t4 = System.nanoTime
it_specialists
.join(reviews, Seq("gplususerid"), "inner") //join the two dataframes using gpluserid in common
.select("gplususerid", "reviewtext", "jobs") // selecting the three fields
.show() //displaying

println("Time taken to display "+(System.nanoTime - t4) / 1e9d)


System.exit(0) // exit the scala function

