package com.antonio.desafio_uber_email.core;

public interface EmailSenderUserCase {

    void sendEmail(String to, String subject, String body);
}
