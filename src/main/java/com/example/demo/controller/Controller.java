package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.types.Response;

@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping("/endpoint")
    public ResponseEntity<Response<String>> testEndpoint() {
        return ResponseEntity.ok(new Response<>("success", "this is data"));
    }
}
