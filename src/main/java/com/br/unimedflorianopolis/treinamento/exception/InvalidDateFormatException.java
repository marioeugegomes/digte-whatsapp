package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class InvalidDateFormatException extends ApmException {
    public InvalidDateFormatException(Exception ex) {
        super(ErrorType.INVALID_DATE_FORMAT.getMessage(), ErrorType.INVALID_DATE_FORMAT.toString(), ex);
    }
}