package com.br.digte.poc.factory.whatsapp.integrations.twillio;

import com.br.digte.poc.factory.whatsapp.IWhatsappIntegration;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class TwillioIntegration implements IWhatsappIntegration  {

    public void sendMessage(String to, String from, String body){
        System.out.println(to);
        System.out.println(from);
        System.out.println(body);

        Twilio.init(TwillioConstant.ACCOUNT_SID, TwillioConstant.AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber( "whatsapp:+" + to),
                new com.twilio.type.PhoneNumber(
                    "whatsapp:+" + from),
                body).create();

        System.out.println(message.getSid());
    }
}
