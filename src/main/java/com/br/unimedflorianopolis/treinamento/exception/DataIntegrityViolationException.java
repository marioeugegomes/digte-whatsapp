package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class DataIntegrityViolationException extends ApmException {
    public DataIntegrityViolationException() {
        super(ErrorType.DATA_INTEGRITY_VIOLATION.getMessage(), ErrorType.DATA_INTEGRITY_VIOLATION.toString());
    }

    public DataIntegrityViolationException(String message) {
        super(message, ErrorType.DATA_INTEGRITY_VIOLATION.toString());
    }
}
