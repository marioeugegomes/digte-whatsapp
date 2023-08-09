package com.br.digte.poc.gateway.model.request;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappRequest {
    @NotNull
    @NotEmpty
    public String to;

    @NotNull
    @NotEmpty
    public String from;

    @NotNull
    @NotEmpty
    public String body;
}