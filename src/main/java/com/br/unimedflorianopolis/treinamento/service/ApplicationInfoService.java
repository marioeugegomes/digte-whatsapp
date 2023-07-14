package com.br.unimedflorianopolis.treinamento.service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.unimedflorianopolis.treinamento.gateway.domain.Application;
import com.br.unimedflorianopolis.treinamento.gateway.model.request.ApplicationRequest;
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

    @Transactional
    public List<Application> save(ApplicationRequest request) {
        var application = new Application();
        application.setVersion(request.getVersion());
        application.setName(request.getName());
        return repository.saveAll(Collections.singletonList(application));
    }

    public Application updateById(String id, ApplicationRequest request) throws Exception {
        var userApplication = repository.findById(UUID.fromString(id)).orElse(null);
        if (Objects.nonNull(userApplication)) {
            userApplication.setName(request.getName());
            userApplication.setVersion(request.getVersion());
            return repository.save(userApplication);
        }
        throw new Exception("Usuário não encontrado!");
    }

    public boolean deleteById(String id) throws Exception {
        var userApplication = repository.findById(UUID.fromString(id)).orElse(null);
        if (Objects.nonNull(userApplication)) {
            repository.deleteById(UUID.fromString(id));
            return true;
        }
        throw new Exception("Usuário não encontrado!");
    }
}
