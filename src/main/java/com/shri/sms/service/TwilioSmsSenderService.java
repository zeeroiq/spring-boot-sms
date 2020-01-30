package com.shri.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TwilioSmsSenderService {

    private final SmsSender twilioSmsSender;

    @Autowired
    public TwilioSmsSenderService(@Qualifier("twilio") TwilioSmsSender twilioSmsSender) {
        this.twilioSmsSender = twilioSmsSender;
    }

    public void sendSms(SmsRequester requester) {
        twilioSmsSender.sendSms(requester);
    }
}
