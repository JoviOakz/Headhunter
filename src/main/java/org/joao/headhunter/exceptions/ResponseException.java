package org.joao.headhunter.exceptions;

public class ResponseException extends RuntimeException {

    private final String message;
    private final int statusCode;

    public ResponseException(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    @Override
    public String getMessage() {
        return message;
    }
    public int getStatusCode() {
        return statusCode;
    }
}
