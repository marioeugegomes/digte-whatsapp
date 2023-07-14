package com.br.unimedflorianopolis.treinamento.service;

import com.br.unimedflorianopolis.treinamento.exception.ValidateException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import com.br.unimedflorianopolis.treinamento.enums.ErrorType;

import java.util.stream.Collectors;
import javax.transaction.Transactional;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.unimedflorianopolis.treinamento.gateway.domain.Application;
import com.br.unimedflorianopolis.treinamento.gateway.model.request.ApplicationRequest;
import com.br.unimedflorianopolis.treinamento.gateway.repository.ApplicationRepository;

@Service
public class ApplicationInfoService {

    private ApplicationRepository repository;
    private Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    @Autowired
    public ApplicationInfoService(ApplicationRepository repository) {
        this.repository = repository;
    }

    public List<Application> listAll() {
        return repository.findAll();
    }

    @Transactional
    public List<Application> save(ApplicationRequest request) throws ValidateException {
        var application = new Application();
        application.setVersion(request.getVersion());
        application.setName(request.getName());

        Set<ConstraintViolation<Application>> violations = validator.validate(application);

        if (violations.size() > 0) {
            throw new ValidateException(violations.stream().map(p -> String.valueOf(p.getMessage()))
            .collect(Collectors.joining("|")));
        }

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
