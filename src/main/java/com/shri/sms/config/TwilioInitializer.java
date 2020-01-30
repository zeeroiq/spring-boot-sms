package com.shri.sms.config;

import com.twilio.Twilio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class TwilioInitializer {

    private final TwiloConfig config;

    @Autowired
    public TwilioInitializer(TwiloConfig config) {
        this.config = config;
        Twilio.init(config.getAccountSid(), config.getAuthToken());
        log.info("Twilio intialized with account sid : " + config.getAccountSid());
    }


}
