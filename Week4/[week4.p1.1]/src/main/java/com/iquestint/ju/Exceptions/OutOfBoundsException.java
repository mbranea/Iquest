package com.iquestint.ju.Exceptions;

public class OutOfBoundsException extends CustomException {
    @Override
    public String getMessage() {
        return "Index out of bounds.";
    }
}
