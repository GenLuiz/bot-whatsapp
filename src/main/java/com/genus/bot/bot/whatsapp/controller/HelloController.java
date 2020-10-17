package com.genus.bot.bot.whatsapp.controller;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${sid}")
    public String ACCOUNT_SID;
    @Value("${authToken}")
    public String AUTH_TOKEN;


    @RequestMapping("/hello")
    public String index() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new PhoneNumber("whatsapp:+554199443970"),
                new PhoneNumber("whatsapp:+1 415 523 8886"),
                "Bom dia familia!")
                .create();
        Message message2 = Message.creator(
                new PhoneNumber("whatsapp:+554197041699"),
                new PhoneNumber("whatsapp:+1 415 523 8886"),
                "Bom dia familia!")
                .create();

        System.out.println(message.getDateCreated());
        return message.getBody();
    }
}