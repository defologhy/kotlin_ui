package com.example.mylayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylayout.utils.Utils
import kotlinx.android.synthetic.main.activity_login_dark_one.*

class LoginDarkOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_dark_one)

        initDataBindings()
    }
    private fun initDataBindings() {
        val id = R.drawable.login_background
        Utils.setImageToImageView(applicationContext, bgImageView, id)
    }
}