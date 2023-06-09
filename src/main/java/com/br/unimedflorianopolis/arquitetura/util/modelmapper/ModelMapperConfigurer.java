package com.br.unimedflorianopolis.arquitetura.util.modelmapper;

import org.modelmapper.ModelMapper;

public interface ModelMapperConfigurer {
    public abstract void configure(ModelMapper modelMapper);
}
