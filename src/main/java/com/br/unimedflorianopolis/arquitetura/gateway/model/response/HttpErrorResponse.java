package com.br.unimedflorianopolis.arquitetura.gateway.model.response;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HttpErrorResponse {

    @SerializedName("error_code")
    private String errorCode;

    @SerializedName("message")
    private String message;
}
