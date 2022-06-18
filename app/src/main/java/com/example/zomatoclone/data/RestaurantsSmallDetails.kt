package com.example.zomatoclone.data

import com.example.zomatoclone.R

data class RestaurantsSmallDetails(
    val id : Int,
    val image : Int,
    val isVeg : Boolean,
    val isPromoted : Boolean = false,
    val isSaved : Boolean = false,
    val restaurantName : String,
    val cuisineTypeFirst : String? = null,
    val cuisineTypeSecond : String? = null,
    val cuisineTypeThird : String? = null,
    val restaurantRating : Double,
    val time : Int,
    val distance : Int,
    val perHeadPrice : Int,
    val discountAvailable : Boolean,
    val discountPercentage : Int? = null,
    val discountUpTo : Int? = null
)

val dummySmallRestaurant = listOf(
    RestaurantsSmallDetails(
            id = 1,
            image = R.drawable.restaurant_1,
            isVeg = false,
            isPromoted = false,
            restaurantName = "Paradise",
            restaurantRating = 4.4,
            time = 40,
            distance = 5,
            perHeadPrice = 300,
            discountAvailable = true,
            discountPercentage = 30,
            discountUpTo = 80
        ),
    RestaurantsSmallDetails(
            id = 2,
            image = R.drawable.restaurant_2,
            isVeg = true,
            isPromoted = false,
            restaurantName = "Chef King",
            restaurantRating = 4.1,
            time = 50,
            distance = 8,
            perHeadPrice = 250,
            discountAvailable = true,
            discountPercentage = 20,
            discountUpTo = 100
        ),
    RestaurantsSmallDetails(
            id = 3,
            image = R.drawable.restaurant_3,
            isVeg = false,
            isPromoted = true,
            restaurantName = "Azeebo Arabian Mandi",
            restaurantRating = 4.5,
            time = 40,
            distance = 12,
            perHeadPrice = 350,
            discountAvailable = true,
            discountPercentage = 20,
            discountUpTo = 100
        ),

    RestaurantsSmallDetails(
            id = 4,
            image = R.drawable.restaurant_4,
            isVeg = true,
            isPromoted = false,
            restaurantName = "Punjabi Dhaba",
            restaurantRating = 3.9,
            time = 20,
            distance = 4,
            perHeadPrice = 200,
            discountAvailable = false,
        ),

    RestaurantsSmallDetails(
            id = 5,
            image = R.drawable.biryani_picture,
            isVeg = false,
            isPromoted = true,
            restaurantName = "Mujtaba Grills",
            restaurantRating = 4.0,
            time = 30,
            distance = 7,
            perHeadPrice = 150,
            discountAvailable = true,
            discountPercentage = 30,
            discountUpTo = 100
        ),
    )

val dummyLargeRestaurants =  listOf<RestaurantsSmallDetails>(
    RestaurantsSmallDetails(
        id = 1,
        image = R.drawable.restaurant_5,
        isVeg = false,
        isPromoted = true,
        restaurantName = "Mujtaba Grills",
        cuisineTypeFirst = "Biryani",
        cuisineTypeSecond = "Mughlai",
        cuisineTypeThird = "North Indian",
        restaurantRating = 4.0,
        time = 30,
        distance = 7,
        perHeadPrice = 150,
        discountAvailable = true,
        discountPercentage = 30,
        discountUpTo = 100
    ),
    RestaurantsSmallDetails(
        id = 2,
        image = R.drawable.restaurant_6,
        isVeg = true,
        isPromoted = false,
        restaurantName = "Tatva",
        cuisineTypeFirst = "Continental",
        cuisineTypeSecond = "North Indian",
        cuisineTypeThird = "Chinese",
        restaurantRating = 4.3,
        time = 57,
        distance = 4,
        perHeadPrice = 400,
        discountAvailable = false,
    ),
    RestaurantsSmallDetails(
        id = 3,
        image = R.drawable.restaurant_7,
        isVeg = false,
        restaurantName = "Sweet Heart",
        cuisineTypeFirst = "Chinese",
        cuisineTypeSecond = "North Indian",
        cuisineTypeThird = "Lebanese",
        restaurantRating = 3.7,
        time = 34,
        distance = 1,
        perHeadPrice = 200,
        discountAvailable = true,
        discountPercentage = 60,
        discountUpTo = 120
    ),
    RestaurantsSmallDetails(
        id = 4,
        image = R.drawable.restaurant_8,
        isVeg = false,
        restaurantName = "Lovely Punjabi Dhaba",
        cuisineTypeFirst = "North Indian",
        cuisineTypeSecond = "Chinese",
        restaurantRating = 4.2,
        time = 29,
        distance = 1,
        perHeadPrice = 150,
        discountAvailable = true,
        discountPercentage = 10,
        discountUpTo = 40
    ),
    RestaurantsSmallDetails(
        id = 5,
        image = R.drawable.restaurant_1,
        isVeg = true,
        restaurantName = "Huber & Holly",
        cuisineTypeFirst = "Pizza",
        cuisineTypeSecond = "Fast Food",
        cuisineTypeThird = "Pasta",
        restaurantRating = 4.3,
        time = 39,
        distance = 4,
        perHeadPrice = 150,
        discountAvailable = true,
        discountPercentage = 30,
        discountUpTo = 75
    ),
)
