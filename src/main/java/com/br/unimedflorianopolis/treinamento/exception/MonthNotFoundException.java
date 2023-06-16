package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class MonthNotFoundException extends ApmException {
    public MonthNotFoundException() {
        super(ErrorType.MONTH_NOT_FOUND.getMessage(), ErrorType.MONTH_NOT_FOUND.toString());
    }

    public MonthNotFoundException(String message) {
        super(message, ErrorType.MONTH_NOT_FOUND.toString());
    }
}
