package me.emrecankoc.examples.helloworld.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomeController
 */
@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("")
    public ResponseEntity<?> getMessage() {
        return ResponseEntity.ok("Hello World!");
    }

}