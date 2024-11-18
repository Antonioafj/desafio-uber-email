package com.antonio.desafio_uber_email.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);

}
