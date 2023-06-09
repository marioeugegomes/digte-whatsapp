package com.br.unimedflorianopolis.arquitetura.exception;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;

public class SupportFundNotFoundException extends ApmException {
    public SupportFundNotFoundException(String msg, Exception ex) {
        super(msg, ErrorType.SUPPORT_FUND_NOT_FOUND.toString(), ex);
    }

    public SupportFundNotFoundException() {
        super(ErrorType.SUPPORT_FUND_NOT_FOUND.getMessage(), ErrorType.SUPPORT_FUND_NOT_FOUND.toString(), null);
    }
}