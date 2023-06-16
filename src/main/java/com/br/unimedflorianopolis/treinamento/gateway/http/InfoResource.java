package com.br.unimedflorianopolis.treinamento.gateway.http;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.unimedflorianopolis.treinamento.gateway.domain.Application;
import com.br.unimedflorianopolis.treinamento.service.ApplicationInfoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/application")
@AllArgsConstructor
public class InfoResource {

    private ApplicationInfoService service;

    @GetMapping("/")
    public List<Application> index(){
        return service.listAll();
    }

    @PostMapping("/create")
    public String create(){
        return "cadastro";
    }
}
