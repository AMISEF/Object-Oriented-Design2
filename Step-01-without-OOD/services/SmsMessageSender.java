package com.example.notification;

public class SmsMessageSender {

    public void sendSms(String phoneNumber, String message) {
        System.out.println("📩 Sending SMS to " + phoneNumber + ": " + message);
    }

}
