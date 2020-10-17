package com.genus.bot.bot.whatsapp.controller;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @Value("${sid}")
    public String ACCOUNT_SID;
    @Value("${authToken}")
    public String AUTH_TOKEN;

    private final static String TWILIO_NUMBER = "whatsapp:+1 415 523 8886";

    private List<String> getContatinhos(){
        List<String> contatinhos = new ArrayList<>();
        contatinhos.add("whatsapp:+554199443970");//eu
        contatinhos.add("whatsapp:+554197041699");//ikaro
        contatinhos.add("whatsapp:+554192744694");//tamires
        contatinhos.add("whatsapp:+554192175207");//maysa
        contatinhos.add("whatsapp:+554198500378");//yuri
        return contatinhos;
    }

    @RequestMapping("/BomDia")
    public String index() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        List<String> contatinhos = getContatinhos();
        for (String contatinho:contatinhos) {
            Message message = Message.creator(
                    new PhoneNumber(contatinho),
                    new PhoneNumber(TWILIO_NUMBER),
                    "Bom dia familia!")
                    .create();
            System.out.println(message.getDateCreated());
        }
        return "BOM DIA MESSAGES SUCCESSFULLY SENT";
    }
}