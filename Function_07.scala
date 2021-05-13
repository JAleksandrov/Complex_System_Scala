val t2 = System.nanoTime
var places = (sqlContext.sql("SELECT * FROM places") // get the places dataset
.groupBy("closed") // group by the field closed which gives the values of true and false
.count()) //the places dataset is placed in count to get the true/false value
println("Time taken to make query "+(System.nanoTime - t2) / 1e9d)


val t3 = System.nanoTime
places.show() // shows the dataframe
println("Time taken to make display dataframe "+(System.nanoTime - t3) / 1e9d)


System.exit(0) // exit the scala function
