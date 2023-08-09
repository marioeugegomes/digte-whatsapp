package com.br.digte.poc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.br.digte.poc.util.modelmapper.ModelMapperFactoryBean;

@Configuration
public class ModelMapperConfiguration {

    @Bean
    public ModelMapperFactoryBean modelMapperFactoryBean() {
        return new ModelMapperFactoryBean();
    }
}
