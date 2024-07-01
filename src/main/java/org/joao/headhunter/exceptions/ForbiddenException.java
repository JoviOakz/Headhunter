package org.joao.headhunter.exceptions;

public class ForbiddenException extends ResponseException {
    public ForbiddenException() {
        super("Your user does not own enough authorization to do the requested service", 403);
    }
}

