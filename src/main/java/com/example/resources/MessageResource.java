package com.example.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/message")
public class MessageResource {
    @GetMapping
    public ResponseEntity<String> displayMessage(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
}
