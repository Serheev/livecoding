package com.serheev.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class BaseHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public Object handleIllegalArgEx(IllegalArgumentException e) {
        Map<String, String> map = new HashMap<>();
        map.put("errorCode", "400");
        map.put("message", e.getMessage());
        return map;
    }

}
