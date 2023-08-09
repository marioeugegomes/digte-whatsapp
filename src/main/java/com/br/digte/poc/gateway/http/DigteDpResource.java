package com.br.digte.poc.gateway.http;

import com.br.digte.poc.gateway.model.request.WhatsappRequest;
import com.br.digte.poc.services.WhatsappService;
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

import com.br.digte.poc.enums.WhatsappEnum;
import com.br.digte.poc.exception.ValidateException;
import com.br.digte.poc.gateway.domain.Application;
import com.br.digte.poc.gateway.model.request.ApplicationRequest;

import lombok.AllArgsConstructor;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/digte")
@AllArgsConstructor
public class DigteDpResource {

    private WhatsappService service;

    @PostMapping("/message")
    public ResponseEntity<WhatsappRequest> message(@RequestBody WhatsappRequest request){
        service.sendMessage(WhatsappEnum.TWILLIO, request.to, request.from, request.body);
        return ResponseEntity.ok(request);
    }
}

