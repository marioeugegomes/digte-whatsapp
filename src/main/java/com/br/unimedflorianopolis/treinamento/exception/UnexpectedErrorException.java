package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

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
