package com.br.unimedflorianopolis.treinamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.unimedflorianopolis.treinamento.gateway.domain.Application;
import com.br.unimedflorianopolis.treinamento.gateway.repository.ApplicationRepository;

@Service
public class ApplicationInfoService {

    private ApplicationRepository repository;

    @Autowired
    public ApplicationInfoService(ApplicationRepository repository) {
        this.repository = repository;
    }

    public List<Application> listAll() {
        return repository.findAll();
    }
}
