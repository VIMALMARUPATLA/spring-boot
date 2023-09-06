package com.aarvi.exception;

import com.aarvi.AarviApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import static org.springframework.http.ResponseEntity.notFound;

@RestControllerAdvice(basePackageClasses = {AarviApplication.class})
@Slf4j
public class RestExceptionHandler {
    
    @ExceptionHandler(value = {VehicleNotFoundException.class})
    public ResponseEntity vehicleNotFound(VehicleNotFoundException ex, WebRequest request) {
        log.debug("handling VehicleNotFoundException...");
        return notFound().build();
    }
    
}
