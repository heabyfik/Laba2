package com.tsu.laba2.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsu.laba2.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTheme(R.style.AppTheme)

        setContentView(R.layout.activity_main)

        addNoteButton.setOnClickListener {
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }
    }
}
//Забавно, что раньше у меня ничего не получалось, но мне всё еще нравилось происходящее. Однако теперь нет. Сдаюсь. Возможно к концу семестра проявится желание пересдать этот модуль. Но точно не сейчас. Извините.