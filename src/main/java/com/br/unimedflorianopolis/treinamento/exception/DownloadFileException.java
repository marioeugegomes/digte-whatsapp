package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class DownloadFileException extends ApmException {
    public DownloadFileException(String msg, Exception ex) {
        super(msg, ErrorType.DOWNLOAD_FILE_ERROR.toString(), ex);
    }

    public DownloadFileException() {
        super(ErrorType.DOWNLOAD_FILE_ERROR.getMessage(), ErrorType.DOWNLOAD_FILE_ERROR.toString(), null);
    }
}