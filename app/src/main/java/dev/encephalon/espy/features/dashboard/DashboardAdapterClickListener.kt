package dev.encephalon.espy.features.dashboard

interface DashboardAdapterClickListener {

    fun onDashboardItemClicked(name: String?,url:String?, description: String?)
}