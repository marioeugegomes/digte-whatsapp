package com.br.unimedflorianopolis.arquitetura.exception;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;

public class GatewayTimeoutException extends ApmException {
    public GatewayTimeoutException(Exception ex) {
        super(ErrorType.GATEWAY_TIMEOUT.getMessage(), ErrorType.GATEWAY_TIMEOUT.toString(), ex);
    }
    public GatewayTimeoutException() {
        super(ErrorType.GATEWAY_TIMEOUT.getMessage(), ErrorType.GATEWAY_TIMEOUT.toString(), null);
    }
}
