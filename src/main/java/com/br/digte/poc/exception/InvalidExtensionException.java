package com.br.digte.poc.exception;

import com.br.digte.poc.enums.ErrorType;

public class InvalidExtensionException extends ApmException {

    private static final long serialVersionUID = -3710304025002742287L;

    public InvalidExtensionException() {
        super(ErrorType.INVALID_EXTENSION.getMessage(), ErrorType.INVALID_EXTENSION.toString());
    }
}
