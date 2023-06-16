package com.br.unimedflorianopolis.treinamento.gateway.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HttpErrorResponse {

    @JsonProperty("error_code")
    @SerializedName("error_code")
    private String errorCode;

    @JsonProperty("message")
    private String message;
}