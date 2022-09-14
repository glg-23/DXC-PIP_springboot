package com.DXC_PIP.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Pagina principale";
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome() {
        return "Benvenuto in Spring Boot";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String ciao() {
        return "Ciao";
    }
}
