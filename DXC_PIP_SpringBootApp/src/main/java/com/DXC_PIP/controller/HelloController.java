package com.DXC_PIP.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/")
    public String index() {
        return "Pagina principale";
    }

    @GetMapping(value = "/welcome")
    public String welcome() {
        return "Benvenuto in Spring Boot";
    }

    @GetMapping(value = "/hello")
    public String ciao() {
        return "Ciao";
    }
}
