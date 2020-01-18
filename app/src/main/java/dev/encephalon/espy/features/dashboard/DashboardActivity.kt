package dev.encephalon.espy.features.dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.encephalon.espy.R
import dev.encephalon.espy.base.BaseActivity
import dev.encephalon.espy.data.parlours.ParlourList
import dev.encephalon.espy.data.parlours.Parlours
import dev.encephalon.espy.data.restaurants.RestaurantList
import dev.encephalon.espy.data.restaurants.Restaurants
import kotlinx.android.synthetic.main.layout_horizontal_item_scroll.*
import kotlinx.android.synthetic.main.layout_vertical_item_scroll.*

class DashboardActivity : BaseActivity(), DashboardAdapterClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        displayList()
    }

    private fun displayList(){
        val restaurants = ArrayList<Restaurants>()
        restaurants.addAll(RestaurantList.getList())

        //show horizontal
        recommended_item_view.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.HORIZONTAL,
            false
        )
        recommended_item_view.adapter =
            RecyclerViewAdapter(restaurants, 0)

        val parlours = ArrayList<Restaurants>()
        parlours.addAll(ParlourList.getList())

        //show vertical
        recommended_item_view_vertical.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )
        recommended_item_view_vertical.adapter =
            RecyclerViewAdapter(parlours, 1)

    }

    override fun onDashboardItemClicked(name: String?) {
        val intent = Intent()
        intent.setClass(this@DashboardActivity, SingleItemActivity::class.java)
        intent.putExtra("name", name)
        startActivity(intent)
    }
}
