package com.br.digte.poc.exception;

import com.br.digte.poc.enums.ErrorType;

public class AnthraxClientException extends ApmException {
    public AnthraxClientException() {
        super(ErrorType.ANTHRAX_CLIENT_ERROR.getMessage(), ErrorType.ANTHRAX_CLIENT_ERROR.toString(), null);
    }

}