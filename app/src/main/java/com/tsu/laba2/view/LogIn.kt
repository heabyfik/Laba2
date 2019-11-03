package com.tsu.laba2.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tsu.laba2.R
import kotlinx.android.synthetic.main.log_in.*

//internal object ValidateEmail {
//
//    @JvmStatic
//    fun main(str: String) {
//
//        //email validation
//        println(Pattern.matches("[a-zA-Z0-9]{1,}[@]{1}[a-z]{5,}[.]{1}+[a-z]{3}", "abcd@gmail.com"))
//    }
//}

class LogIn : AppCompatActivity() {

//    private val str=email.text

//    private fun isEmailValid(): Boolean {
//        return android.util.Patterns.EMAIL_ADDRESS.matcher(this.str.toString()).matches()
//    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.log_in)

//        setTheme(R.style.AppTheme)
        

        enterButton.setOnClickListener{
           val intent=Intent(this, CheckInActivity::class.java)
            startActivity(intent)
        }
        checkInButton.setOnClickListener{
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
//        checkInButton.setOnClickListener{
//            if (Regex("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}\$").matches(email))
//        }
    }
}