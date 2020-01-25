package dev.encephalon.espy.data.restaurants

object RestaurantList {

    fun getList(): List<Restaurants>{
        val imageList = ArrayList<Restaurants>()

        imageList.clear()
        imageList.add(
            Restaurants(
                "https://i.ibb.co/NYS5LGk/bergerology1.jpg",
                "Bergerology","fnndjnfjd"
            )
        )
        imageList.add(
            Restaurants(
                "https://i.ibb.co/wBgkg5z/FB-IMG-1577025554853.jpg",
                "Tabaq","fdfbdhbf"
            )
        )
        imageList.add(
            Restaurants(
                "https://i.ibb.co/NW3MXFf/FB-IMG-1577024502436.jpg",
                "Jafran","fdfdhbf"
            )
        )
        imageList.add(
            Restaurants(
                "https://i.ibb.co/wyNqFC9/FB-IMG-1577025742828.jpg",
                "Baba Rafi","fdjfnjdnf"
            )
        )
        imageList.add(
            Restaurants(
                "https://i.ibb.co/ctwJPLw/FB-IMG-1577025865713.jpg",
                "Meal Deal","fdjfndjfn"
            )
        )
        imageList.add(
            Restaurants(
                "https://i.ibb.co/WDcybr7/cea1eefe-0b55-49aa-8eb9-9ee37c2e58f0-600x336.jpg",
                "Burger King","fjdjnfdjnf"
            )
        )
        imageList.add(
            Restaurants(
                "https://i.ibb.co/ZcF4BhK/sultans-kacchi.jpg",
                "Sultan Dine","fmdjfndjnf"
            )
        )
        imageList.add(
            Restaurants(
                "https://i.ibb.co/nB7h7PZ/hqdefault.jpg",
                "কাচ্চি ভাই","mfdjnfjdnf"
            )
        )
        imageList.add(
            Restaurants(
                "https://i.ibb.co/nsj7Bfp/5f288d42-6802-c404-5426-08d486835cd0-large.jpg",
                "Khanas","jfdjnfjdnfd"
            )
        )



        return imageList
    }

    //bergerology
    //jafran header: https://i.ibb.co/c2NbFpk/FB-IMG-1577024462940.jpg
}