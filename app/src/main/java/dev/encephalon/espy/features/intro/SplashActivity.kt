package dev.encephalon.espy.features.intro

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import dev.encephalon.espy.R
import dev.encephalon.espy.base.BaseActivity
import dev.encephalon.espy.features.login.LoginActivity

class SplashActivity : BaseActivity() {

    companion object {
        private const val splashTimeOut = 2000  // 2 sec
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val toStartIntent: Intent
            toStartIntent = Intent(this@SplashActivity, LoginActivity::class.java)
            /*when {
                SharedPreferencesManager.getBoolean(applicationContext, "loggedin") -> {
                    toStartIntent = Intent(this@SplashActivity, PortalActivity::class.java)
                }
                else -> {
                    toStartIntent = Intent(this@SplashActivity, LoginActivity::class.java)
                    toStartIntent.putExtra("error", 0)
                    toStartIntent.putExtra("title", "")
                    toStartIntent.putExtra("message", "")
                }
            }*/
            startActivity(toStartIntent)
            finish()
        }, splashTimeOut.toLong())
    }
}