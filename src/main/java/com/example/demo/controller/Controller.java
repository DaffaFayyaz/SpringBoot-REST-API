package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.types.Response;

@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping("/endpoint")
    public ResponseEntity<Response<String>> testEndpoint() {
        return ResponseEntity.ok(new Response<>("success", "this is data"));
    }

    @GetMapping("/endpoint/{id}")
    public ResponseEntity<Response<String>> testEndpoint(@PathVariable("id") String id) {
        return ResponseEntity.ok(new Response<>("success", "this is data id: " + id));
    }

    @PostMapping
    public ResponseEntity<Response<String>> testPost(@RequestBody String requestBody) {
        return ResponseEntity.ok(new Response<>("success", "received data: " + requestBody));
    }
}
