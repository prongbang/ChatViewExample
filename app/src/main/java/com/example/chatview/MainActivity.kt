package com.example.chatview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chatview.chat.ChatAdapter
import com.example.chatview.chat.ChatMessage
import com.example.chatview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val chatAdapter by lazy { ChatAdapter() }

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
        initLoad()
    }

    private fun initView() {
        with(binding) {
            chatRecyclerView.apply {
                adapter = chatAdapter
                layoutManager = LinearLayoutManager(context)
            }
        }
    }

    private fun initLoad() {
        val messageList = arrayListOf<ChatMessage>()
        for (i in 1..100) {
            messageList.add(ChatMessage(id = i))
        }
        chatAdapter.submitList(messageList)
    }
}