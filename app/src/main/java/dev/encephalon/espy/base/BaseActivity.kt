package dev.encephalon.espy.base

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    val isOnline: Boolean
        get() {
            val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            if (Build.VERSION.SDK_INT < 23) {
                val netInfo = cm.activeNetworkInfo
                return (netInfo!= null && netInfo.isConnected && (netInfo.type == ConnectivityManager.TYPE_WIFI || netInfo.type == ConnectivityManager.TYPE_MOBILE))
            } else {
                //val netInfo = cm.activeNetworkInfo
                val networkCapabilities = cm.getNetworkCapabilities(cm.activeNetwork)
                return (networkCapabilities!= null && ( networkCapabilities.hasTransport(
                    NetworkCapabilities.TRANSPORT_CELLULAR) || networkCapabilities.hasTransport(
                    NetworkCapabilities.TRANSPORT_WIFI) ) )
            }
        }
}