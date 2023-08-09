package com.br.digte.poc.factory.whatsapp;

import com.br.digte.poc.enums.WhatsappEnum;
import com.br.digte.poc.factory.whatsapp.integrations.twillio.TwillioIntegration;

public class WhatsappFactory {

    public static IWhatsappIntegration getInstance(WhatsappEnum type) {
         IWhatsappIntegration _instance;

         switch(type) {
            case TWILLIO:
             _instance = new TwillioIntegration();
            break;
            default:
             return new TwillioIntegration();
        }

        return _instance;
    }
}
