package com.br.digte.poc.exception;

import com.br.digte.poc.enums.ErrorType;

public class InternalServerErrorException extends ApmException {
    public InternalServerErrorException(Exception ex) {
        super(ErrorType.INTERNAL_SERVER_ERROR.getMessage(), ErrorType.INTERNAL_SERVER_ERROR.toString(), ex);
    }
    public InternalServerErrorException() {
        super(ErrorType.INTERNAL_SERVER_ERROR.getMessage(), ErrorType.INTERNAL_SERVER_ERROR.toString(), null);
    }
}
