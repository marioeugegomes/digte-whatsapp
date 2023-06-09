package com.br.unimedflorianopolis.arquitetura.exception;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;

public class DownloadFileException extends ApmException {
    public DownloadFileException(String msg, Exception ex) {
        super(msg, ErrorType.DOWNLOAD_FILE_ERROR.toString(), ex);
    }

    public DownloadFileException() {
        super(ErrorType.DOWNLOAD_FILE_ERROR.getMessage(), ErrorType.DOWNLOAD_FILE_ERROR.toString(), null);
    }
}