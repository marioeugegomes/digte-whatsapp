package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class InvalidExtensionException extends ApmException {

    private static final long serialVersionUID = -3710304025002742287L;

    public InvalidExtensionException() {
        super(ErrorType.INVALID_EXTENSION.getMessage(), ErrorType.INVALID_EXTENSION.toString());
    }
}
