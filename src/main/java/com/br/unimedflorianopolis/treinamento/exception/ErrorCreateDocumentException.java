package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class ErrorCreateDocumentException extends ApmException {
    public ErrorCreateDocumentException(String msg, Exception ex) {
        super(msg, ErrorType.CREATE_DOCUMENT_ERROR.toString(), ex);
    }

    public ErrorCreateDocumentException() {
        super(ErrorType.CREATE_DOCUMENT_ERROR.getMessage(), ErrorType.CREATE_DOCUMENT_ERROR.toString(), null);
    }
}