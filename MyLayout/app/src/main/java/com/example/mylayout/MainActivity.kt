package com.example.mylayout

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
        setupAction()

    }

    private fun setupAction() {
        toLoginOne.setOnClickListener {
            val toGreenPage = Intent(this,
                LoginGreenOne::class.java)
            startActivity(toGreenPage)
        }
        toLoginTwo.setOnClickListener {
            val toBluePage = Intent(this,
                LoginBlueOne::class.java)
            startActivity(toBluePage)
        }
        toLoginThree.setOnClickListener {
            val toDarkPage = Intent(this,
                LoginDarkOne::class.java)
            startActivity(toDarkPage)
        }
    }

    private fun initUI() {

//        toolbar.setNavigationIcon(R.drawable.baseline_arrow_back_black_24)
//
//        if (toolbar.navigationIcon != null) {
//            toolbar.navigationIcon?.setColorFilter(ContextCompat.getColor(this, R.color.md_white_1000), PorterDuff.Mode.SRC_ATOP)
//        }

        toolbar.title = "Choose Login Form"

        try {
            toolbar.setTitleTextColor(ContextCompat.getColor(this,R.color.md_white_1000))
        } catch (e: Exception) {
            Log.e("TEAMPS", "Can't set color.")
        }
//
//        try {
//            setSupportActionBar(toolbar)
//        } catch (e: Exception) {
//            Log.e("TEAMPS", "Error in set support action bar.")
//        }

        try {
            if (supportActionBar != null) {
                supportActionBar?.setDisplayHomeAsUpEnabled(true)
            }
        } catch (e: Exception) {
            Log.e("TEAMPS", "Error in set display home as up enabled.")
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}