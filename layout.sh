echo "- CW2 Complex Systems -"
function functionality_choices() {
echo -e "<nPlease read through the functionalities of the system and enter the number corresponding to the functionality you would like to execute"
echo -e "\n1. Compute the number of reviews in the reviews dataset that have a rating which is equal to a user scepcified value. \n2. Compute the number of places in the places dataset for every price range. \n3. Create a subset of the users dataset by keeping only the 'IT Specialist' users. 4. Compute the 20 most frequent phrases (a sequence of 3 consecutive words) that appear in the reviewText of reviews that have a rating equal to a user specified value. \n5. Retrieve all places that have more than 3 reviews. \n6. Retrieve all reviews from the Reviews dataset that are written by 'IT Specialist' users. \n7. COmpute the numbers of places in the Places dataset that are permanently closed (the value of the 'closed' field in the places dataset is 'true') and the numbers of places that are still operating (the value of the closed field is 'False'). /n8. An inverted document index associates a word with the documents that this word appears. By building an inverted index, a search engine knows all the documents related to this a word and thus it can display results back to the user in a straightforward manner. 'n9. Compute the average rating for each category in the reviews dataset. \n10. Find the top 5 categories in the reviews dataset that have the highest average rating. \n11. compute the number of places that are still operating for every price range. \n12. Compute the average rating for each price range. \n13 Compute the number of reviews for each price range. \n14. Compute the average length (in terms of characters) of reviews for each rating. \n15. Find the place id and name that has reciewved the larged number of reviews."

read -p "Enter which functionality you would like to execute 1-15: " choice
}

functionality_choices

if [ $choice -eq 1 ]; then
echo "You chose functionality 1"
spark-shell -i Function_01.scala

elif [ $choice -eq 2 ]; then
echo "You chose functionality 2"
spark-shell -i Function_02.scala


elif [ $choice -eq 3 ]; then
echo "You chose functionality 3"
spark-shell -i Function_03.scala


elif [ $choice -eq 4 ]; then
echo "You chose functionality 4"
spark-shell -i Function_04.scala


elif [ $choice -eq 5 ]; then
echo "You chose functionality 5"
spark-shell -i Function_05.scala


elif [ $choice -eq 6 ]; then
echo "You chose functionality 6"
spark-shell -i Function_06.scala


elif [ $choice -eq 7 ]; then
echo "You chose functionality 7"
spark-shell -i Function_07.scala


elif [ $choice -eq 8 ]; then
echo "You chose functionality 8"
spark-shell -i Function_08.scala


elif [ $choice -eq 9 ]; then
echo "You chose functionality 9"
spark-shell -i Function_9.scala


elif [ $choice -eq 10 ]; then
echo "You chose functionality 10"
spark-shell -i Function_10.scala


elif [ $choice -eq 11 ]; then
echo "You chose functionality 11"
spark-shell -i func11.scala

elif [ $choice -eq 12 ]; then
echo "You chose functionality 12"
hive -f func12.sql

elif [ $choice -eq 13 ]; then
echo "You chose functionality 13"
hive -f func13.sql

elif [ $choice -eq 14 ]; then
echo "You chose functionality 14"
hive -f func14.sql

elif [ $choice -eq 15 ]; then
echo "You chose functionality 15"
hive -f func15.sql

fi

