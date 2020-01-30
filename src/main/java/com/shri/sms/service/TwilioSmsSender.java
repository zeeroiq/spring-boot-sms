package com.shri.sms.service;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("twilio")
@Slf4j
public class TwilioSmsSender implements SmsSender {

    @Override
    public void sendSms(SmsRequester request) {

        if(isPhoneNumberValid(request.getPhoneNumber())) {

            PhoneNumber to = new PhoneNumber(request.getPhoneNumber());
            PhoneNumber from = new PhoneNumber("+1 202 929 2187");
            String message = request.getMessage();
            MessageCreator creator = Message.creator(to, from, message);
            creator.create();
            log.info("validation is successful for phone number : " + request.getPhoneNumber());

        } else {
            throw new IllegalArgumentException("Phone Number [" + request.getPhoneNumber()
                        + "] is not a valid number");
        }
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        // Todo: implementation of phone number validator
        return true;
    }
}
