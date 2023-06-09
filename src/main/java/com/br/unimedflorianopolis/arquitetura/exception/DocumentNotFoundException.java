package com.br.unimedflorianopolis.arquitetura.exception;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;

public class DocumentNotFoundException extends ApmException {
    public DocumentNotFoundException(String msg, Exception ex) {
        super(msg, ErrorType.DOCUMENT_NOT_FOUND.toString(), ex);
    }

    public DocumentNotFoundException() {
        super(ErrorType.DOCUMENT_NOT_FOUND.getMessage(), ErrorType.DOCUMENT_NOT_FOUND.toString(), null);
    }
}