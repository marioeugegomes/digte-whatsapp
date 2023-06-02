package com.br.unimedflorianopolis.arquitetura.factory;

import com.br.unimedflorianopolis.arquitetura.gateway.model.response.HttpErrorResponse;
import co.elastic.apm.api.ElasticApm;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class HttpErrorResponseFactory {

    private HttpErrorResponseFactory() {
    }

    public static HttpErrorResponse build(String errorCode) {
        return HttpErrorResponse.builder().errorCode(errorCode).build();
    }

    public static HttpErrorResponse build(String errorCode, String message) {
        ElasticApm.currentTransaction()
                .addLabel("errorCode", errorCode)
                .addLabel("errorMessage", message);
        return HttpErrorResponse.builder().errorCode(errorCode).message(message).build();
    }

    public static HttpErrorResponse build(String errorCode, Throwable ex) {
        log.error(errorCode, ex);
        final String message = Optional.of(ex).map(Throwable::getMessage).orElseGet(ex::toString);

        return build(errorCode, message);
    }

}