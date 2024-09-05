package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.types.Response;
import com.example.demo.types.Request;

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

    @PostMapping("/endpoint")
    public ResponseEntity<Response<Request>> testPost(@RequestBody Request requestBody) {
        return ResponseEntity.ok(new Response<>("success", requestBody));
    }
}
