package dev.encephalon.espy.data.caffe



object CaffeList {
    fun getList(): List<Caffes>{
        val imageList = ArrayList<Caffes>()
        imageList.clear()
        imageList.add(
            Caffes("https://i.ibb.co/NYS5LGk/bergerology1.jpg",
                "Bergerology")
        )
        return imageList
    }
}