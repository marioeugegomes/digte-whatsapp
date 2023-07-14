package com.br.unimedflorianopolis.treinamento.gateway.http;



import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.unimedflorianopolis.treinamento.exception.ValidateException;
import com.br.unimedflorianopolis.treinamento.gateway.domain.Application;
import com.br.unimedflorianopolis.treinamento.gateway.model.request.ApplicationRequest;
import com.br.unimedflorianopolis.treinamento.service.ApplicationInfoService;

import lombok.AllArgsConstructor;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/application")
@AllArgsConstructor
public class InfoResource {

    private ApplicationInfoService service;

    @GetMapping("/")
    public ResponseEntity<List<Application>> index(){
        return ResponseEntity.ok(service.listAll());
    }

    @PostMapping("/")
    public ResponseEntity<List<Application>> create(@RequestBody ApplicationRequest request){
        return ResponseEntity.ok(service.save(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Application> updateById(@PathVariable(required = true, name = "id") String id,
                                                  @RequestBody ApplicationRequest request) throws Exception {
        return ResponseEntity.ok(service.updateById(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(required = true, name = "id") String id) throws Exception {
        return ResponseEntity.ok(service.deleteById(id));
    }
}

