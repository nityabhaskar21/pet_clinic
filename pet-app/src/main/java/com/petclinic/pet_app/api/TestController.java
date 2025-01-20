package com.petclinic.pet_app.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    private String testApp() {
        return "Hello!";
    }
}
