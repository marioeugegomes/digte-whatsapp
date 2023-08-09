package com.br.digte.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.br.evoluum.cache.EnabledEvoluumCache;

import co.elastic.apm.api.ElasticApm;

@EnableAspectJAutoProxy
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnabledEvoluumCache
public class Application {
    public static void main(String[] args) {
        try {
			SpringApplication.run(Application.class, args);
		} catch (Exception e) {
			ElasticApm.currentSpan().captureException(new Exception(e.getClass().getSimpleName()));
		}
    }
}