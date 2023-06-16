package com.br.unimedflorianopolis.treinamento.enums;


import com.br.unimedflorianopolis.treinamento.exception.BadGatewayException;
import com.br.unimedflorianopolis.treinamento.exception.BadRequestException;
import com.br.unimedflorianopolis.treinamento.exception.DataBaseErrorException;
import com.br.unimedflorianopolis.treinamento.exception.DataIntegrityViolationException;
import com.br.unimedflorianopolis.treinamento.exception.DateNotFoundException;
import com.br.unimedflorianopolis.treinamento.exception.DocumentNotFoundException;
import com.br.unimedflorianopolis.treinamento.exception.DownloadException;
import com.br.unimedflorianopolis.treinamento.exception.DownloadFileException;
import com.br.unimedflorianopolis.treinamento.exception.DownloadServiceNotFoundException;
import com.br.unimedflorianopolis.treinamento.exception.GatewayTimeoutException;
import com.br.unimedflorianopolis.treinamento.exception.InternalServerErrorException;
import com.br.unimedflorianopolis.treinamento.exception.InvalidExtensionException;
import com.br.unimedflorianopolis.treinamento.exception.KafkaTimedOutException;
import com.br.unimedflorianopolis.treinamento.exception.ReadExcelSupportFundException;
import com.br.unimedflorianopolis.treinamento.exception.ServiceUnavailableException;
import com.br.unimedflorianopolis.treinamento.exception.UnauthorizedException;
import com.br.unimedflorianopolis.treinamento.exception.UnexpectedErrorException;
import com.br.unimedflorianopolis.treinamento.exception.UnimedCoreNotFoundException;
import com.br.unimedflorianopolis.treinamento.exception.UploadException;


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

