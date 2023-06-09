package com.br.unimedflorianopolis.arquitetura.factory;

import java.util.Arrays;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;
import com.br.unimedflorianopolis.arquitetura.exception.UnexpectedErrorException;

public class ExceptionsFactory {

    private ExceptionsFactory(){}

    public static void exceptionsThrower(final String errorCode) {
        ErrorType errorType = Arrays.stream(ErrorType.values())
                .filter(e -> e.toString().equals(errorCode))
                .findFirst()
                .orElseThrow(() -> new UnexpectedErrorException());
        errorType.exceptionsThrower();
    }
}
