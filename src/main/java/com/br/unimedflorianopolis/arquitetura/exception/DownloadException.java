package com.br.unimedflorianopolis.arquitetura.exception;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;

public class DownloadException extends ApmException {
    public DownloadException(String msg, Exception ex) {
        super(msg, ErrorType.DOWNLOAD_ERROR.toString(), ex);
    }

    public DownloadException() {
        super(ErrorType.DOWNLOAD_ERROR.getMessage(), ErrorType.DOWNLOAD_ERROR.toString(), null);
    }
}