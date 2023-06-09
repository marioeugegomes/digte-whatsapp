package com.br.unimedflorianopolis.arquitetura.exception;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;

public class UnimedCoreNotFoundException extends ApmException {

    public UnimedCoreNotFoundException(Exception ex) {
        super(ErrorType.UNIMED_CORE_NOT_FOUND.getMessage(), ErrorType.UNIMED_CORE_NOT_FOUND.toString(), ex);
    }

    public UnimedCoreNotFoundException() {
        super(ErrorType.UNIMED_CORE_NOT_FOUND.getMessage(), ErrorType.UNIMED_CORE_NOT_FOUND.toString());
    }

    public UnimedCoreNotFoundException(String msg, Exception ex) {
        super(msg, ErrorType.UNIMED_CORE_NOT_FOUND.toString(), ex);
    }

    public UnimedCoreNotFoundException(String msg) {
        super(msg, ErrorType.UNIMED_CORE_NOT_FOUND.toString());
    }
}