package com.sa.chatapp;

public class Message {
    private String messageId;
    private String text;
    private String senderUid;
    private String receiverUid;

    public Message() {
        // Boş yapıcı metod gerekli Firebase'de
    }

    public Message(String messageId, String text, String senderUid, String receiverUid) {
        this.messageId = messageId;
        this.text = text;
        this.senderUid = senderUid;
        this.receiverUid = receiverUid;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSenderUid() {
        return senderUid;
    }

    public void setSenderUid(String senderUid) {
        this.senderUid = senderUid;
    }

    public String getreceiverUid() {
        return receiverUid;
    }

    public void setreceiverUid(String timestamp) {
        this.receiverUid = timestamp;
    }
}
