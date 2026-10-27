package com.georges.todoapp.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    public static class ErrorResponse {
        private int status;
        private String genericMessage;
        private String detailedMessage;
        private LocalDateTime timestamp;

        public ErrorResponse(int status, String genericMessage, String detailedMessage, LocalDateTime timestamp) {
            this.status = status;
            this.genericMessage = genericMessage;
            this.detailedMessage = detailedMessage;
            this.timestamp = timestamp;
        }

        public int getStatus() {return status;}
        public String getGenericMessage() {return genericMessage;}
        public String getDetailedMessage() {return detailedMessage;}
        public LocalDateTime getTimestamp() {return timestamp;}
    }

    @ExceptionHandler(TaskNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFound(TaskNotFoundException ex) {
        ErrorResponse error = new ErrorResponse(
            HttpStatus.NOT_FOUND.value(),
            "Resource Not Found",
            ex.getMessage(),
            LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MissingArgumentException.class)
    public ResponseEntity<ErrorResponse> handleBadRequest(MissingArgumentException ex) {
        ErrorResponse error = new ErrorResponse(
            HttpStatus.BAD_REQUEST.value(),
            "Bad Request",
            ex.getMessage(),
            LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}