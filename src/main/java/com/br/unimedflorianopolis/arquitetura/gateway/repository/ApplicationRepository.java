package com.br.unimedflorianopolis.arquitetura.gateway.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.br.unimedflorianopolis.arquitetura.gateway.domain.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, UUID>, JpaSpecificationExecutor<Application> {

    @Query(value = "select * from application where name like %:name%", nativeQuery = true)
    List<Application> findByCrmAndYear(
            @Param("name") String name
    );

    @Override
    List<Application> findAll(@Nullable Specification<Application> var1);
}
