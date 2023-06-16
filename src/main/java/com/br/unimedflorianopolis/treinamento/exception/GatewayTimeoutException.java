package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class GatewayTimeoutException extends ApmException {
    public GatewayTimeoutException(Exception ex) {
        super(ErrorType.GATEWAY_TIMEOUT.getMessage(), ErrorType.GATEWAY_TIMEOUT.toString(), ex);
    }
    public GatewayTimeoutException() {
        super(ErrorType.GATEWAY_TIMEOUT.getMessage(), ErrorType.GATEWAY_TIMEOUT.toString(), null);
    }
}
