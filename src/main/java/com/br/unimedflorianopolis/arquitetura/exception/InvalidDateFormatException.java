package com.br.unimedflorianopolis.arquitetura.exception;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;

public class InvalidDateFormatException extends ApmException {
    public InvalidDateFormatException(Exception ex) {
        super(ErrorType.INVALID_DATE_FORMAT.getMessage(), ErrorType.INVALID_DATE_FORMAT.toString(), ex);
    }
}