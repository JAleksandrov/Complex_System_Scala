
select max(rating), places.gPlusPlaceId, places.name from places inner join reviews on places.gPlusPlaceId=reviews.gPlusPlaceId group by place;
