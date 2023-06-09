package com.br.unimedflorianopolis.arquitetura.exception;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;

public class ReadExcelSupportFundException extends ApmException {

    public ReadExcelSupportFundException() {
        super(ErrorType.READ_EXCEL_SUPPORT_FUND_EXCEPTION.getMessage(), ErrorType.READ_EXCEL_SUPPORT_FUND_EXCEPTION.toString());
    }
}
