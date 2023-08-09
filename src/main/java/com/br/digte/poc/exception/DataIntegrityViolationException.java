package com.br.digte.poc.exception;

import com.br.digte.poc.enums.ErrorType;

public class DataIntegrityViolationException extends ApmException {
    public DataIntegrityViolationException() {
        super(ErrorType.DATA_INTEGRITY_VIOLATION.getMessage(), ErrorType.DATA_INTEGRITY_VIOLATION.toString());
    }

    public DataIntegrityViolationException(String message) {
        super(message, ErrorType.DATA_INTEGRITY_VIOLATION.toString());
    }
}
