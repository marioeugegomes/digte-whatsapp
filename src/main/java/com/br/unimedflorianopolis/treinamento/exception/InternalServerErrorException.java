package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class InternalServerErrorException extends ApmException {
    public InternalServerErrorException(Exception ex) {
        super(ErrorType.INTERNAL_SERVER_ERROR.getMessage(), ErrorType.INTERNAL_SERVER_ERROR.toString(), ex);
    }
    public InternalServerErrorException() {
        super(ErrorType.INTERNAL_SERVER_ERROR.getMessage(), ErrorType.INTERNAL_SERVER_ERROR.toString(), null);
    }
}
