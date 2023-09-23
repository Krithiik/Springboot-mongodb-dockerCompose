package com.example.demo.Exceptions;


public class NoRecordFoundException extends RuntimeException {

    public NoRecordFoundException(String msg) {
        super(msg);
    }
}