package com.br.digte.poc.exception;

import com.br.digte.poc.enums.ErrorType;

public class InvalidDateFormatException extends ApmException {
    public InvalidDateFormatException(Exception ex) {
        super(ErrorType.INVALID_DATE_FORMAT.getMessage(), ErrorType.INVALID_DATE_FORMAT.toString(), ex);
    }
}