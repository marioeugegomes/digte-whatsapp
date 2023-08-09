package com.br.digte.poc.exception;

import org.apache.commons.lang3.exception.ExceptionUtils;
import com.br.digte.poc.enums.ErrorType;

import java.util.List;

public class ValidateException extends ApmException {
    public ValidateException(String msg) {
        super(msg, ErrorType.VALIDATE_ERROR.toString(), null);
	}

    public ValidateException() {
        super(ErrorType.VALIDATE_ERROR.getMessage(), ErrorType.VALIDATE_ERROR.toString(), null);
	}
}