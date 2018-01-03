package com.iquestint.ju.Exceptions;

public class NotNumberException extends CustomException {

    @Override
    public String getMessage() {
        return "Invalid number.";
    }
}
