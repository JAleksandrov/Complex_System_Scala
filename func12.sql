select places.price, avg(reviews.rating) from places inner join reviews on reviews.gPlusPlaceId=places.gPlusPlaceId where (price =='$' or price =='$$' or price=='$$$') group by price;

create table if not exists places (gPlusPlaceId STRING, name STRING, price STRING, address STRING, hours STRING, phone STRING, closed STRING) row format delimited fields terminated by '/t';

create table if not exists reviews (gPlusPlaceId STRING, gPlusUserId STRING, rating DOUBLE, reviewerName STRING, categories STRING, reviewTime STRING) row format delimited fields terminated by '/t';
