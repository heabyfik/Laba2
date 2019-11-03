package com.tsu.laba2.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tsu.laba2.R
import kotlinx.android.synthetic.main.log_in.*

class CheckInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.check_in)

//        setTheme(R.style.AppTheme)

        enterButton.setOnClickListener{
            intent= Intent(this, LogIn::class.java)
            startActivity(intent)
        }
        checkInButton.setOnClickListener{
            intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}