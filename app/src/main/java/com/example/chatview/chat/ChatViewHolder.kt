package com.example.chatview.chat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chatview.databinding.ItemChatMessageBinding

class ChatViewHolder(
    private val binding: ItemChatMessageBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ChatMessage) {
        with(binding) {

        }
    }

    companion object {
        fun newInstance(parent: ViewGroup): ChatViewHolder = ChatViewHolder(
            ItemChatMessageBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }
}