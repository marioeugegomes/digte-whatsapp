package com.br.unimedflorianopolis.arquitetura.gateway.model.response;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopicResponse<T> implements ParameterizedType {
    @Expose
    public String status;

    @Expose
    public T response;

    @Expose
    public TopicErrorResponse error;

    private Class<?> wrapped;

    public TopicResponse(Class<T> wrapped) {
        this.wrapped = wrapped;
    }

    public static <T> com.br.unimedflorianopolis.arquitetura.gateway.model.response.TopicResponse<T> fromJson(String json, Class<T> responseTypeClass) {
        return new Gson().fromJson(json, new com.br.unimedflorianopolis.arquitetura.gateway.model.response.TopicResponse<T>(responseTypeClass));
    }

    public Type[] getActualTypeArguments() {
        return new Type[]{wrapped};
    }

    public Type getRawType() {
        return com.br.unimedflorianopolis.arquitetura.gateway.model.response.TopicResponse.class;
    }

    public Type getOwnerType() {
        return null;
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}
