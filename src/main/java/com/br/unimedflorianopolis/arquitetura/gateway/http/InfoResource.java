package com.br.unimedflorianopolis.arquitetura.gateway.http;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.unimedflorianopolis.arquitetura.gateway.domain.Application;
import com.br.unimedflorianopolis.arquitetura.service.ApplicationInfoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping
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
