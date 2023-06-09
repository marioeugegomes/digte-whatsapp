package com.br.unimedflorianopolis.arquitetura.exception;

import com.br.unimedflorianopolis.arquitetura.enums.ErrorType;

public class KafkaTimedOutException extends ApmException {
    public KafkaTimedOutException(String msg, Exception ex) {
        super(msg, ErrorType.KAFKA_TIMED_OUT.toString(), ex);
    }

    public KafkaTimedOutException() {
        super(ErrorType.KAFKA_TIMED_OUT.getMessage(), ErrorType.KAFKA_TIMED_OUT.toString(), null);
    }
}