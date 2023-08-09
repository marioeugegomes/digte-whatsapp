package com.br.digte.poc.factory;

import com.br.digte.poc.gateway.model.response.HttpErrorResponse;

import co.elastic.apm.api.ElasticApm;

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

}