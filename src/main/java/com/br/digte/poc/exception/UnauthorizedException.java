package com.br.digte.poc.exception;
import com.br.evoluum.cache.enums.ErrorType;

public class UnauthorizedException extends ApmException {
    public UnauthorizedException(Exception ex) {
        super(ErrorType.UNAUTHORIZED.getMessage(), ErrorType.UNAUTHORIZED.toString(), ex);
    }

    public UnauthorizedException(String msg) {
        super(msg, ErrorType.UNAUTHORIZED.toString());
    }
    public UnauthorizedException() {
        super(ErrorType.UNAUTHORIZED.getMessage(), ErrorType.UNAUTHORIZED.toString(), null);
    }
}