package com.br.digte.poc.exception;

import com.br.digte.poc.enums.ErrorType;

public class GatewayTimeoutException extends ApmException {
    public GatewayTimeoutException(Exception ex) {
        super(ErrorType.GATEWAY_TIMEOUT.getMessage(), ErrorType.GATEWAY_TIMEOUT.toString(), ex);
    }
    public GatewayTimeoutException() {
        super(ErrorType.GATEWAY_TIMEOUT.getMessage(), ErrorType.GATEWAY_TIMEOUT.toString(), null);
    }
}
