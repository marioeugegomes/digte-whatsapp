package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class ServiceUnavailableException extends ApmException {
    public ServiceUnavailableException(Exception ex) {
        super(ErrorType.SERVICE_UNAVAILABLE.getMessage(), ErrorType.SERVICE_UNAVAILABLE.toString(), ex);
    }
    public ServiceUnavailableException() {
        super(ErrorType.SERVICE_UNAVAILABLE.getMessage(), ErrorType.SERVICE_UNAVAILABLE.toString(), null);
    }
}
