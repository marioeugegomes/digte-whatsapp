package com.br.unimedflorianopolis.arquitetura.exception;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;

public class DownloadServiceNotFoundException extends ApmException {
    public DownloadServiceNotFoundException(String msg, Exception ex) {
        super(msg, ErrorType.DOWNLOAD_SERVICE_NOT_FOUND.toString(), ex);
    }

    public DownloadServiceNotFoundException() {
        super(ErrorType.DOWNLOAD_SERVICE_NOT_FOUND.getMessage(), ErrorType.DOWNLOAD_SERVICE_NOT_FOUND.toString(), null);
    }
}