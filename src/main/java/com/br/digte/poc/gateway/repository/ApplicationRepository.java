package com.br.digte.poc.gateway.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.digte.poc.gateway.domain.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, UUID> {

}
