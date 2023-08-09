package com.br.digte.poc.exception;

import com.br.digte.poc.enums.ErrorType;

public class MonthNotFoundException extends ApmException {
    public MonthNotFoundException() {
        super(ErrorType.MONTH_NOT_FOUND.getMessage(), ErrorType.MONTH_NOT_FOUND.toString());
    }

    public MonthNotFoundException(String message) {
        super(message, ErrorType.MONTH_NOT_FOUND.toString());
    }
}
