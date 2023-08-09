package com.br.digte.poc.exception;

import com.br.digte.poc.enums.ErrorType;

public class ServiceUnavailableException extends ApmException {
    public ServiceUnavailableException(Exception ex) {
        super(ErrorType.SERVICE_UNAVAILABLE.getMessage(), ErrorType.SERVICE_UNAVAILABLE.toString(), ex);
    }
    public ServiceUnavailableException() {
        super(ErrorType.SERVICE_UNAVAILABLE.getMessage(), ErrorType.SERVICE_UNAVAILABLE.toString(), null);
    }
}
