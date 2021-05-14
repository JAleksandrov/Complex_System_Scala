select avg(length(reviewText)) from reviews where (rating =='1.0' or rating =='2.0' or rating =='3.0' or rating =='4.0' or rating =='5.0') group by rating;
