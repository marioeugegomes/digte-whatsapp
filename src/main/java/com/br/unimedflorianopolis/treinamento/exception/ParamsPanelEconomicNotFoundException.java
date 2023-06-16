package com.br.unimedflorianopolis.treinamento.exception;

import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

public class ParamsPanelEconomicNotFoundException extends ApmException {
    public ParamsPanelEconomicNotFoundException() {
        super(ErrorType.PARAMS_PANEL_ECONOMIC_NOT_FOUND.getMessage(), ErrorType.PARAMS_PANEL_ECONOMIC_NOT_FOUND.toString());
    }

    public ParamsPanelEconomicNotFoundException(String message) {
        super(message, ErrorType.PARAMS_PANEL_ECONOMIC_NOT_FOUND.toString());
    }
}
