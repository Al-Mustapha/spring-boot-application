package com.example.spring_boot_application.Week8;

import jakarta.servlet.ServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalAdviser {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> userNotFoundException(UserNotFoundException userNotFoundException,
                                                        ServletRequest request){

        return ResponseEntity.status(404).body(userNotFoundException.getMessage());
    }
}
