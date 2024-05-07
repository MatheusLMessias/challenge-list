package com.matheusmessias.desafio.exception;
public class BadRequestException extends RuntimeException {

    public BadRequestException(String message) {
        super(message);
    }

}