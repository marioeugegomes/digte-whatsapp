package com.br.digte.poc.exception.handler;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.br.evoluum.cache.exceptions.BadGatewayException;
import com.br.digte.poc.enums.ErrorType;
import com.br.digte.poc.exception.BadRequestException;
import com.br.digte.poc.exception.DateNotFoundException;
import com.br.digte.poc.exception.DocumentNotFoundException;
import com.br.digte.poc.exception.DownloadException;
import com.br.digte.poc.exception.DownloadFileException;
import com.br.digte.poc.exception.ErrorCreateDocumentException;
import com.br.digte.poc.exception.InvalidDateFormatException;
import com.br.digte.poc.exception.MonthNotFoundException;
import com.br.digte.poc.exception.ParamsPanelEconomicNotFoundException;
import com.br.digte.poc.exception.ReadExcelSupportFundException;
import com.br.digte.poc.exception.SupportFundNotFoundException;
import com.br.digte.poc.exception.TypeDocumentNotFoundException;
import com.br.digte.poc.exception.UnexpectedErrorException;
import com.br.digte.poc.exception.UnimedCoreNotFoundException;
import com.br.digte.poc.exception.UploadException;
import com.br.digte.poc.exception.ValidateException;
import com.br.digte.poc.factory.HttpErrorResponseFactory;
import com.br.digte.poc.gateway.model.response.HttpErrorResponse;

@ControllerAdvice
public class HttpExceptionHandler extends ResponseEntityExceptionHandler {

    private Logger log = LoggerFactory.getLogger(HttpExceptionHandler.class);

    /*================== EXCECOES DE NEGOCIO =====================*/
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<HttpErrorResponse> handleBadRequestException(BadRequestException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }

    @ExceptionHandler(InvalidDateFormatException.class)
    public ResponseEntity<HttpErrorResponse> handleInvalidDateFormatException(InvalidDateFormatException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }

    @ExceptionHandler(UnexpectedErrorException.class)
    public ResponseEntity<HttpErrorResponse> handleUnexpectedErrorException(UnexpectedErrorException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }

    @ExceptionHandler(ErrorCreateDocumentException.class)
    public ResponseEntity<HttpErrorResponse> handleErrorCreateDocumentException(ErrorCreateDocumentException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }

    @ExceptionHandler(MonthNotFoundException.class)
    public ResponseEntity<HttpErrorResponse> handleMonthNotFoundException(MonthNotFoundException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }

    @ExceptionHandler(SupportFundNotFoundException.class)
    public ResponseEntity<HttpErrorResponse> handleSupportFundNotFoundException(SupportFundNotFoundException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<HttpErrorResponse> handleDataIntegrityErrorException(DataIntegrityViolationException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(HttpErrorResponseFactory.build(e.getLocalizedMessage(), e.getMessage()));
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<HttpErrorResponse> handleDataIntegrityErrorException(ConstraintViolationException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(HttpErrorResponseFactory.build(String.valueOf(e.getErrorCode()), e.getMessage()));
    }

    @ExceptionHandler(ReadExcelSupportFundException.class)
    public ResponseEntity<HttpErrorResponse> handleReadExcelErrorException(ReadExcelSupportFundException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }

    @ExceptionHandler({ Exception.class })
    protected ResponseEntity<HttpErrorResponse> handleGenericException(Exception e, HttpServletRequest request) {
        String error = e.getMessage() == null ? e.toString() : e.getMessage();
        log.error(error);

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(HttpErrorResponseFactory.build(ErrorType.GENERIC_ERROR.toString(), error));
    }

    @ExceptionHandler(UnimedCoreNotFoundException.class)
    public ResponseEntity<HttpErrorResponse> handleUnimedCoreNotFoundException(UnimedCoreNotFoundException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }
    @ExceptionHandler(BadGatewayException.class)
    public ResponseEntity<HttpErrorResponse> handleUnexpectedErrorExceptionCache(com.br.evoluum.cache.exceptions.BadGatewayException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }

    @ExceptionHandler(UploadException.class)
    public ResponseEntity<HttpErrorResponse> handleUploadException(UploadException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }

    @ExceptionHandler(TypeDocumentNotFoundException.class)
    public ResponseEntity<HttpErrorResponse> handleUploadException(TypeDocumentNotFoundException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }

    @ExceptionHandler(DownloadException.class)
    public ResponseEntity<HttpErrorResponse> handleDownloadException(DownloadException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }
    @ExceptionHandler(DocumentNotFoundException.class)
    public ResponseEntity<HttpErrorResponse> handleAttachmentException(DocumentNotFoundException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }
    @ExceptionHandler(DateNotFoundException.class)
    public ResponseEntity<HttpErrorResponse> handleDateNotFoundException(DateNotFoundException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }
    @ExceptionHandler(ParamsPanelEconomicNotFoundException.class)
    public ResponseEntity<HttpErrorResponse> handleParamsPanelEconomicNotFoundException(ParamsPanelEconomicNotFoundException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }
    @ExceptionHandler(DownloadFileException.class)
    public ResponseEntity<HttpErrorResponse> handleDownloadFileException(DownloadFileException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }

    @ExceptionHandler(ValidateException.class)
    public ResponseEntity<HttpErrorResponse> handleValidateException(ValidateException e, HttpServletRequest request) {
        log.error(e.getMessage());

        return ResponseEntity
                .status(HttpStatus.UNPROCESSABLE_ENTITY)
                .body(HttpErrorResponseFactory.build(e.getErrorCode(), e.getMessage()));
    }


    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException e, HttpHeaders headers, HttpStatus status, WebRequest request) {
        log.error(e.getMessage());

        List<String> errors = e.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(FieldError::<String>getDefaultMessage)
                .collect(Collectors.toList());

        String error = new StringBuilder().append(errors).append(" ").append(e.getMessage()).toString();

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(HttpErrorResponseFactory.build(ErrorType.METHOD_ARG_NOT_VALID_ERROR.toString(), error));
    }
}
