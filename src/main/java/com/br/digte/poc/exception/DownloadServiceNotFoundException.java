package com.br.digte.poc.exception;

import com.br.digte.poc.enums.ErrorType;

public class DownloadServiceNotFoundException extends ApmException {
    public DownloadServiceNotFoundException(String msg, Exception ex) {
        super(msg, ErrorType.DOWNLOAD_SERVICE_NOT_FOUND.toString(), ex);
    }

    public DownloadServiceNotFoundException() {
        super(ErrorType.DOWNLOAD_SERVICE_NOT_FOUND.getMessage(), ErrorType.DOWNLOAD_SERVICE_NOT_FOUND.toString(), null);
    }
}