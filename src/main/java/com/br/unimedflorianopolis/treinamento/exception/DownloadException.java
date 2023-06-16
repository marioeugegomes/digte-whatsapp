package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class DownloadException extends ApmException {
    public DownloadException(String msg, Exception ex) {
        super(msg, ErrorType.DOWNLOAD_ERROR.toString(), ex);
    }

    public DownloadException() {
        super(ErrorType.DOWNLOAD_ERROR.getMessage(), ErrorType.DOWNLOAD_ERROR.toString(), null);
    }
}