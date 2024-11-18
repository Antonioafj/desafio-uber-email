package com.antonio.desafio_uber_email.core.exceptions;

public class EmailServiceException extends RuntimeException {

    public EmailServiceException(String message) {
        super(message);
    }

    public EmailServiceException(String messge, Throwable cause){
        super(messge, cause);
    }
}
