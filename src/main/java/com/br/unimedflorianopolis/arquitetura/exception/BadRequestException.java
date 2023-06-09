package com.br.unimedflorianopolis.arquitetura.exception;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;

public class BadRequestException extends ApmException {
    public BadRequestException() {
        super(ErrorType.BAD_REQUEST.getMessage(), ErrorType.BAD_REQUEST.toString());
    }

    public BadRequestException(String message) {
        super(message, ErrorType.BAD_REQUEST.toString());
    }
}
