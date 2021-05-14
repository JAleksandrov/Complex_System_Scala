val t1 = System.nanoTime
val price_df = sqlContext.sql("SELECT price FROM places WHERE ((price == '$' OR price == '$$' OR price = '$$$') AND closed == 'False')")
println("Time taken to make query "+(System.nanoTime - t1) / 1e9d)

val t2 = System.nanoTime
val group_price = price_df.groupBy("price").count
println("Time taken to display dataframe "+(System.nanoTime - t2) / 1e9d)

val t3 = System.nanoTime
group_price.foreach { row =>
  val price = row.mkString(",").split(",")(0)
  val count = row.mkString(",").split(",")(1)

  println("Price range " + price + " contains " + count + " places")
}
println("Time taken to make foreach "+(System.nanoTime - t3) / 1e9d)

System.exit(0)
