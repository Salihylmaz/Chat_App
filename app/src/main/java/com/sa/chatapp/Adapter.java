package com.sa.chatapp;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter {
    public static class MessageViewHolder extends RecyclerView.ViewHolder {
        TextView messageText;

        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);
            messageText = itemView.findViewById(R.id.text_message);
        }

        public void bind(Message message) {
            messageText.setText(message.getText());
        }
    }


    public static class MessageAdapter extends RecyclerView.Adapter<MessageViewHolder> {
        private ArrayList<Message> messages;
        private String currentUser;

        public MessageAdapter(ArrayList<Message> messages, String currentUser) {
            this.messages = messages;
            this.currentUser = currentUser;
        }

        @NonNull
        @Override
        public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_item, parent, false);
            return new MessageViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
            Message message = messages.get(position);
            if (message.getSenderUid().equals(currentUser)) {
                holder.messageText.setBackgroundResource(R.drawable.message_background_right);
                holder.messageText.setGravity(Gravity.END);
            } else {
                holder.messageText.setBackgroundResource(R.drawable.message_background_left);
                holder.messageText.setGravity(Gravity.START);
            }
            holder.bind(message);
        }

        @Override
        public int getItemCount() {
            return messages.size();
        }
    }

}