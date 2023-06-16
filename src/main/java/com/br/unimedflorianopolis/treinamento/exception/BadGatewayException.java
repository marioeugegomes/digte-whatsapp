package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class BadGatewayException extends ApmException {
    public BadGatewayException(Exception ex) {
        super(ErrorType.INTERNAL_SERVER_ERROR.getMessage(), ErrorType.INTERNAL_SERVER_ERROR.toString(), ex);
    }
    public BadGatewayException() {
        super(ErrorType.BAD_GATEWAY.getMessage(), ErrorType.BAD_GATEWAY.toString(), null);
    }
}
