package com.br.unimedflorianopolis.arquitetura.factory;

import com.br.unimedflorianopolis.arquitetura.enums.ResponseStatus;
import com.br.unimedflorianopolis.arquitetura.gateway.model.response.TopicErrorResponse;
import com.br.unimedflorianopolis.arquitetura.gateway.model.response.TopicResponse;

public class TopicResponseFactory {

    private TopicResponseFactory() {
        // empty private constructor
    }

    public static <T> TopicResponse<T> buildSuccess(T response) {
        return TopicResponse<T>builder()
                .status(ResponseStatus.SUCCESS.toString())
                .response(response)
                .build();
    }

    public static <T> TopicResponse<T> buildSuccess() {
        return TopicResponse.<T>builder()
                .status(ResponseStatus.SUCCESS.toString())
                .build();
    }

    public static <T> TopicResponse<T> buildError(String errorCode) {
        return TopicResponse.<T>builder()
                .status(ResponseStatus.ERROR.toString())
                .error(TopicErrorResponse.builder().code(errorCode).build())
                .build();
    }

    public static <T> TopicResponse<T> buildError(String errorCode, String errorMessage) {
        return TopicResponse.<T>builder()
                .status(ResponseStatus.ERROR.toString())
                .error(TopicErrorResponse.builder().code(errorCode).message(errorMessage).build())
                .build();
    }
}