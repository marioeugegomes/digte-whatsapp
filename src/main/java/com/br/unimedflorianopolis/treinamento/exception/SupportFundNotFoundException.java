package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class SupportFundNotFoundException extends ApmException {
    public SupportFundNotFoundException(String msg, Exception ex) {
        super(msg, ErrorType.SUPPORT_FUND_NOT_FOUND.toString(), ex);
    }

    public SupportFundNotFoundException() {
        super(ErrorType.SUPPORT_FUND_NOT_FOUND.getMessage(), ErrorType.SUPPORT_FUND_NOT_FOUND.toString(), null);
    }
}