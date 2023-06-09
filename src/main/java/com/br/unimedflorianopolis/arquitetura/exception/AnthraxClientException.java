package com.br.unimedflorianopolis.arquitetura.exception;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;

public class AnthraxClientException extends ApmException {
    public AnthraxClientException() {
        super(ErrorType.ANTHRAX_CLIENT_ERROR.getMessage(), ErrorType.ANTHRAX_CLIENT_ERROR.toString(), null);
    }

}