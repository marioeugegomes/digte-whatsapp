package com.br.digte.poc.exception;
import co.elastic.apm.api.ElasticApm;

public class BusinessException extends RuntimeException {
	public BusinessException(String name, Exception ex) {
		super(name);
		ElasticApm.currentSpan().captureException(this);
		ElasticApm.currentSpan().captureException(ex);
	}
}
