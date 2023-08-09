package com.br.digte.poc.exception;

import com.br.digte.poc.enums.ErrorType;

public class BadGatewayException extends ApmException {
    public BadGatewayException(Exception ex) {
        super(ErrorType.INTERNAL_SERVER_ERROR.getMessage(), ErrorType.INTERNAL_SERVER_ERROR.toString(), ex);
    }
    public BadGatewayException() {
        super(ErrorType.BAD_GATEWAY.getMessage(), ErrorType.BAD_GATEWAY.toString(), null);
    }
}
