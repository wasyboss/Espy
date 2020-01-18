package dev.encephalon.espy.data.parlours

import dev.encephalon.espy.data.restaurants.Restaurants

object ParlourList {

    fun getList(): List<Restaurants>{
        val imageList = ArrayList<Restaurants>()

        imageList.clear()
        imageList.add(
            Restaurants(
                "https://i.ibb.co/5Y3cn2K/received-295150918097805.jpg",
                "Persona"
            )
        )
        imageList.add(
            Restaurants(
                "https://i.ibb.co/X5VtPgT/received-462935714266445.jpg",
                "Annya Konna"
            )
        )
        imageList.add(
            Restaurants(
                "https://i.ibb.co/n3tdYvM/11-min-1539608609.jpg",
                "Eves Beauty Parlour"
            )
        )
        imageList.add(
            Restaurants(
                "https://i.ibb.co/k4BH6Ss/IMG-20180430-144817.jpg",
                "Essence Women Parlour"
            )
        )
        imageList.add(
            Restaurants(
                "https://i.ibb.co/9VMSZRY/index.jpg",
                "Avera Day Spa & Hair Salon"
            )
        )
        imageList.add(
            Restaurants(
                "https://i.ibb.co/wRzjsPj/studio.jpg",
                "Studio Salon"
            )
        )

        imageList.add(
            Restaurants(
                "https://i.ibb.co/yBbYFB0/2.jpg",
                "RED Beauty Studio & Salon"
            )
        )

        return imageList
    }

    //bergerology
    //jafran header: https://i.ibb.co/c2NbFpk/FB-IMG-1577024462940.jpg
}