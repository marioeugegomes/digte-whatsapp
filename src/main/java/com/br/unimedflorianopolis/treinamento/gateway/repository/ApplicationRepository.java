package com.br.unimedflorianopolis.treinamento.gateway.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.unimedflorianopolis.treinamento.gateway.domain.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, UUID> {

}
