package com.br.unimedflorianopolis.arquitetura.exception;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;

public class TypeDocumentNotFoundException extends ApmException {
    public TypeDocumentNotFoundException(String msg, Exception ex) {
        super(msg, ErrorType.TYPE_DOCUMENT_NOT_FOUND.toString(), ex);
    }

    public TypeDocumentNotFoundException() {
        super(ErrorType.TYPE_DOCUMENT_NOT_FOUND.getMessage(), ErrorType.TYPE_DOCUMENT_NOT_FOUND.toString(), null);
    }
}