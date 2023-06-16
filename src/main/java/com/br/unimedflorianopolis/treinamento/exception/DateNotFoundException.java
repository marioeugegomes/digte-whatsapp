package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class DateNotFoundException extends ApmException {
    public DateNotFoundException() {
        super(ErrorType.DATE_NOT_FOUND.getMessage(), ErrorType.DATE_NOT_FOUND.toString());
    }

    public DateNotFoundException(String message) {
        super(message, ErrorType.DATE_NOT_FOUND.toString());
    }
}
