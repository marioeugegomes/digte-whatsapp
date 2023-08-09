package com.br.digte.poc.exception;

import com.br.digte.poc.enums.ErrorType;

public class DateNotFoundException extends ApmException {
    public DateNotFoundException() {
        super(ErrorType.DATE_NOT_FOUND.getMessage(), ErrorType.DATE_NOT_FOUND.toString());
    }

    public DateNotFoundException(String message) {
        super(message, ErrorType.DATE_NOT_FOUND.toString());
    }
}
