package com.br.unimedflorianopolis.arquitetura.exception;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;

public class UnexpectedErrorException extends ApmException {
    public UnexpectedErrorException(Exception ex) {
        super(ErrorType.UNEXPECTED_ERROR.getMessage(), ErrorType.UNEXPECTED_ERROR.toString(), ex);
    }

    public UnexpectedErrorException() {
        super(ErrorType.UNEXPECTED_ERROR.getMessage(), ErrorType.UNEXPECTED_ERROR.toString(), null);
    }

    public UnexpectedErrorException(String message, Exception ex) {
        super(message, ErrorType.UNEXPECTED_ERROR.toString(), ex);
    }
}
