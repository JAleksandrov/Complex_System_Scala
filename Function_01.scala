
var rating = readLine("Enter rating: ")

var reviews_count = sqlContext.sql("SELECT rating FROM reviews WHERE rating = " + rating)
val t2 = System.nanoTime

print("Number of reviews with rating "+rating+" is " + reviews_count.count() + "\n")
val t3 = System.nanoTime

println("Time taken to make query "+(System.nanoTime - t2) / 1e9d)
println("Time taken to display output " +(System.nanoTime - t3) / 1e9d)
System.exit(0)



