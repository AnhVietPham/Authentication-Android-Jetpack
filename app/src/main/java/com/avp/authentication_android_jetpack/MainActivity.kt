package com.avp.authentication_android_jetpack

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val iNavController =
            Navigation.findNavController(this, R.id.nav_host_fragment)
        toolbar.setOnClickListener {
            if (!iNavController.popBackStack()) {
                finish()
            }
        }
        iNavController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.welcomeToSenDoSellerFragment) {
                imvBack.visibility = View.GONE
            } else {
                imvBack.visibility = View.VISIBLE
            }
        }
    }
}