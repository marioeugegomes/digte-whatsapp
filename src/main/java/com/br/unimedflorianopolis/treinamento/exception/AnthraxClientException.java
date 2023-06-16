package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class AnthraxClientException extends ApmException {
    public AnthraxClientException() {
        super(ErrorType.ANTHRAX_CLIENT_ERROR.getMessage(), ErrorType.ANTHRAX_CLIENT_ERROR.toString(), null);
    }

}