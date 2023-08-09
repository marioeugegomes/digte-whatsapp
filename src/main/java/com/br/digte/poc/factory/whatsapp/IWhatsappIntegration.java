package com.br.digte.poc.factory.whatsapp;

public interface IWhatsappIntegration {
    void sendMessage(String to, String from, String body);
}
