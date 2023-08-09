package com.br.digte.poc.services;

import com.br.digte.poc.enums.WhatsappEnum;
import com.br.digte.poc.factory.whatsapp.WhatsappFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WhatsappService {

    @Autowired
    public WhatsappService() {}

    public void sendMessage(WhatsappEnum type, String to, String from, String message) {
        try {
            var wtz = WhatsappFactory.getInstance(type);
            wtz.sendMessage(to, from, message);

        } catch (Exception ex) {
            throw ex;
        }
    }
}
