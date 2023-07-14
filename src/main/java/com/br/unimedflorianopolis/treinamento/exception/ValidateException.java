package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class ValidateException extends ApmException {
    public ValidateException(String msg, Exception ex) {
        super(msg, ErrorType.VALIDATE_ERROR.toString(), ex);
    }

    public ValidateException() {
        super(ErrorType.VALIDATE_ERROR.getMessage(), ErrorType.VALIDATE_ERROR.toString(), null);
    }
}