package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class TypeDocumentNotFoundException extends ApmException {
    public TypeDocumentNotFoundException(String msg, Exception ex) {
        super(msg, ErrorType.TYPE_DOCUMENT_NOT_FOUND.toString(), ex);
    }

    public TypeDocumentNotFoundException() {
        super(ErrorType.TYPE_DOCUMENT_NOT_FOUND.getMessage(), ErrorType.TYPE_DOCUMENT_NOT_FOUND.toString(), null);
    }
}