select places.price, count(reviews.rating) from places inner join reviews on reviews.gPlusPlaceId=places.gPlusPlaceId where (price =='$' or price =='$$' or price=='$$$') group by price;
