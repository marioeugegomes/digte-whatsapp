package com.br.digte.poc.enums;


import com.br.digte.poc.exception.BadGatewayException;
import com.br.digte.poc.exception.BadRequestException;
import com.br.digte.poc.exception.DataBaseErrorException;
import com.br.digte.poc.exception.DataIntegrityViolationException;
import com.br.digte.poc.exception.DateNotFoundException;
import com.br.digte.poc.exception.DocumentNotFoundException;
import com.br.digte.poc.exception.DownloadException;
import com.br.digte.poc.exception.DownloadFileException;
import com.br.digte.poc.exception.DownloadServiceNotFoundException;
import com.br.digte.poc.exception.GatewayTimeoutException;
import com.br.digte.poc.exception.InternalServerErrorException;
import com.br.digte.poc.exception.InvalidExtensionException;
import com.br.digte.poc.exception.KafkaTimedOutException;
import com.br.digte.poc.exception.ReadExcelSupportFundException;
import com.br.digte.poc.exception.ServiceUnavailableException;
import com.br.digte.poc.exception.UnauthorizedException;
import com.br.digte.poc.exception.UnexpectedErrorException;
import com.br.digte.poc.exception.UnimedCoreNotFoundException;
import com.br.digte.poc.exception.UploadException;
import com.br.digte.poc.exception.ValidateException;


public enum ErrorType {

    GENERIC_ERROR("generic_error") {
        @Override
        public void exceptionsThrower() {
            throw new InternalServerErrorException();
        }
    },
    DATABASE_ERROR("Um erro relacionado ao banco de dados ocorreu.") {
        @Override
        public void exceptionsThrower() {
            throw new DataBaseErrorException();
        }
    },
    DATA_INTEGRITY_VIOLATION("Um erro ocorreu ao tentar salvar valores duplicados."){
        @Override
        public void exceptionsThrower() {
            throw new DataIntegrityViolationException();
        }
    },
    INVALID_EXTENSION("A extensão do arquivo é invalida."){
        @Override
        public void exceptionsThrower() {
            throw new InvalidExtensionException();
        }
    },
    READ_EXCEL_SUPPORT_FUND_EXCEPTION("Ocorreu um erro ao ler o arquivo excel."){
        @Override
        public void exceptionsThrower() {
            throw new ReadExcelSupportFundException();
        }
    },
    METHOD_ARG_NOT_VALID_ERROR("Argumento ou valor(es) inválido(s)."),
    BAD_REQUEST("Um ou mais parâmetros está em formato incorreto.") {
        @Override
        public void exceptionsThrower() {
            throw new BadRequestException();
        }
    },
    DOWNLOAD_SERVICE_NOT_FOUND("O serviço de download não foi encontrado"){
        @Override
        public void exceptionsThrower() {
            throw new DownloadServiceNotFoundException();
        }
    },
    UNIMED_CORE_NOT_FOUND("O webservice Unimed-Core encontra-se indisponível no momento.") {
        @Override
        public void exceptionsThrower() {
            throw new UnimedCoreNotFoundException();
        }
    },
    BAD_GATEWAY("O retorno do serviço do erp Unimed não está em formato conhecido.") {
        @Override
        public void exceptionsThrower() {
            throw new BadGatewayException();
        }
    },
    UNAUTHORIZED("O token informado é inválido.") {
        @Override
        public void exceptionsThrower() {
            throw new UnauthorizedException();
        }
    },
    UNEXPECTED_ERROR("Um erro inesperado ocorreu, por favor, verifique os logs.") {
        @Override
        public void exceptionsThrower() {
            throw new UnexpectedErrorException();
        }
    },
    INVALID_DATE_FORMAT("A data informada é inválida."),
    KAFKA_TIMED_OUT("Reply timed out") {
        @Override
        public void exceptionsThrower() {
            throw new KafkaTimedOutException();
        }
    },
    SERVICE_UNAVAILABLE("O serviço do erp Unimed está indisponível no momento, tente novamente mais tarde.") {
        @Override
        public void exceptionsThrower() {
            throw new ServiceUnavailableException();
        }
    },
    GATEWAY_TIMEOUT("O serviço não respondeu.") {
        @Override
        public void exceptionsThrower() {
            throw new GatewayTimeoutException();
        }
    },
    DATE_NOT_FOUND("Uma data deve ser informada."){
        @Override
        public void exceptionsThrower() {
            throw new DateNotFoundException();
        }
    },
    UPLOAD_ERROR("O arquivo não foi anexado.") {
        @Override
        public void exceptionsThrower() {
            throw new UploadException();
        }
    },
    VALIDATE_ERROR("Ocorreu um erro ao executar a ação.") {
        @Override
        public void exceptionsThrower() {
            throw new ValidateException();
        }
    },
    DOWNLOAD_ERROR("O documento não pode ser baixado.") {
        @Override
        public void exceptionsThrower() {
            throw new DownloadException();
        }
    },
    DOCUMENT_NOT_FOUND("O documento não foi encontrado.") {
        @Override
        public void exceptionsThrower() {
            throw new DocumentNotFoundException();
        }
    },
    DOWNLOAD_FILE_ERROR("Ocorreu um erro ao efetuar o download do documento.") {
        @Override
        public void exceptionsThrower() {
            throw new DownloadFileException();
        }
    },
    INTERNAL_SERVER_ERROR("O serviço do erp Unimed retornou um erro desconhecido.") {
        @Override
        public void exceptionsThrower() {
            throw new InternalServerErrorException();
        }
    },
    SUPPORT_FUND_NOT_FOUND("As informações para criação do documento fundo de sustentabilidade não foram encontradas."),
    CREATE_DOCUMENT_ERROR("Ocorreu um erro ao criar o documento PDF."),
    MONTH_NOT_FOUND("O mês deve ser informado."),
    PARAMS_PANEL_ECONOMIC_NOT_FOUND("Os paramêtros de painel econômico não foram encontrados na requisição."),
    ANTHRAX_CLIENT_ERROR("Ocorreu um error ao buscar informações no anthrax."),
    TYPE_DOCUMENT_NOT_FOUND("O tipo de documento não foi encontrado.");

    private String error;
    public void exceptionsThrower() {
        throw new UnexpectedErrorException();
    }

    ErrorType(String error) {
        this.error = error;
    }

    public String getMessage() {
        return this.error;
    }
}

