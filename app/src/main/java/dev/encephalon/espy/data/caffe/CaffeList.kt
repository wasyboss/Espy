package dev.encephalon.espy.data.caffe

object CaffeList {
    fun getList(): List<Caffes>{
        val imageList = ArrayList<Caffes>()
        imageList.clear()
        imageList.add(
            Caffes()
        )
        return imageList
    }
}