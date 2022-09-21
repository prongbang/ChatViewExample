package com.example.chatview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chatview.chat.ChatAdapter

class MainActivity : AppCompatActivity() {

    private val chatAdapter by lazy { ChatAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {

    }
}