package com.shri.sms.service;

import com.shri.sms.service.SmsRequester;

public interface SmsSender {

    public void sendSms(SmsRequester requester);
}
