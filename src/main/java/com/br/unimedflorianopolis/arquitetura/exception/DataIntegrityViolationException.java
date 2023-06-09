package com.br.unimedflorianopolis.arquitetura.exception;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;

public class DataIntegrityViolationException extends ApmException {
    public DataIntegrityViolationException() {
        super(ErrorType.DATA_INTEGRITY_VIOLATION.getMessage(), ErrorType.DATA_INTEGRITY_VIOLATION.toString());
    }

    public DataIntegrityViolationException(String message) {
        super(message, ErrorType.DATA_INTEGRITY_VIOLATION.toString());
    }
}
