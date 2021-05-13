val t1 = System.nanoTime
val it_subset = (sqlContext.sql("SELECT * FROM users")
.filter($"jobs" === "IT Specialist")
)
println("Time taken to make query "+(System.nanoTime - t1) / 1e9d)


val t2 = System.nanoTime
it_subset.show()
println("Time taken to display dataframe "+(System.nanoTime - t2) / 1e9d)

System.exit(0)

