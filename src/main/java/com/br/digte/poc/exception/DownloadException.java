package com.br.digte.poc.exception;

import com.br.digte.poc.enums.ErrorType;

public class DownloadException extends ApmException {
    public DownloadException(String msg, Exception ex) {
        super(msg, ErrorType.DOWNLOAD_ERROR.toString(), ex);
    }

    public DownloadException() {
        super(ErrorType.DOWNLOAD_ERROR.getMessage(), ErrorType.DOWNLOAD_ERROR.toString(), null);
    }
}