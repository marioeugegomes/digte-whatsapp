package com.br.unimedflorianopolis.arquitetura.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.br.unimedflorianopolis.arquitetura.util.modelmapper.ModelMapperFactoryBean;

@Configuration
public class ModelMapperConfiguration {

    @Bean
    public ModelMapperFactoryBean modelMapperFactoryBean() {
        return new ModelMapperFactoryBean();
    }
}
