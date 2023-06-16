package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class UploadException extends ApmException {
    public UploadException(String msg, Exception ex) {
        super(msg, ErrorType.UPLOAD_ERROR.toString(), ex);
    }

    public UploadException() {
        super(ErrorType.UPLOAD_ERROR.getMessage(), ErrorType.UPLOAD_ERROR.toString(), null);
    }
}