package com.br.digte.poc.exception;

import com.br.digte.poc.enums.ErrorType;

public class DataBaseErrorException extends ApmException {

    public DataBaseErrorException(Exception ex) {
        super(ErrorType.DATABASE_ERROR.getMessage(), ErrorType.DATABASE_ERROR.toString(), ex);
    }
    public DataBaseErrorException() {
        super(ErrorType.DATABASE_ERROR.getMessage(), ErrorType.DATABASE_ERROR.toString(), null);
    }
    public DataBaseErrorException(String message, Exception ex) {
        super(message, ErrorType.DATABASE_ERROR.toString(), ex);
    }

}