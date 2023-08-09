package com.br.digte.poc.exception;

import com.br.digte.poc.enums.ErrorType;

public class ReadExcelSupportFundException extends ApmException {

    public ReadExcelSupportFundException() {
        super(ErrorType.READ_EXCEL_SUPPORT_FUND_EXCEPTION.getMessage(), ErrorType.READ_EXCEL_SUPPORT_FUND_EXCEPTION.toString());
    }
}
