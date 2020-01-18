package dev.encephalon.espy.features.dashboard

import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import dev.encephalon.espy.R
import dev.encephalon.espy.base.BaseActivity
import kotlinx.android.synthetic.main.activity_single_item.*

class SingleItemActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_item)

        val name = intent.getStringExtra("name")
        val url = intent.getStringArrayExtra("url")
        textView9.text = name
        val imageView: ImageView = findViewById(R.id.single_item_header_image)
        Glide.with(this@SingleItemActivity).load(url).into(imageView)
    }
}