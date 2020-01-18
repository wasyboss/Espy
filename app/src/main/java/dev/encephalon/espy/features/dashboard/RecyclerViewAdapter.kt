package dev.encephalon.espy.features.dashboard

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.encephalon.espy.R
import dev.encephalon.espy.data.restaurants.Restaurants
import org.jetbrains.anko.sdk27.coroutines.onClick

class RecyclerViewAdapter(private val imageList: ArrayList<Restaurants>, private val orientation: Int): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private var mDashboardAdapterClickListener : DashboardAdapterClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        if (orientation == 0) {
            return ViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.layout_item_vertical,
                    parent,
                    false
                )
            )
        } else {
            return ViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.layout_item_horizontal,
                    parent,
                    false
                )
            )
        }
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(imageList[position])
        holder.itemView.onClick {
            val intent = Intent()
            intent.setClass(holder.itemView.context, SingleItemActivity::class.java)
            intent.putExtra("name", imageList[position].name)
            intent.putExtra("url", imageList[position].url)
            holder.itemView.context.startActivity(intent)
            //mDashboardAdapterClickListener?.onDashboardItemClicked( holder.itemName.text.toString() )
        }
    }

    inner class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {

        val itemName: TextView = itemView.findViewById(R.id.text)
        fun bindItems(items: Restaurants){
            val textView: TextView = itemView.findViewById(R.id.text)
            val imageView: ImageView = itemView.findViewById(R.id.image)
            textView.text = items.name
            Glide.with(itemView.context).load(items.url).into(imageView)
        }

    }

}