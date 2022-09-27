package com.DXC_PIP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    @GetMapping(value = "/welcome")
    public String welcome(@RequestParam String name, Model model) {
        //Passare parametro nell'URL (es: /welcome?name=gianluigi)
        String messaggio = "Benvenuto " + name;
        model.addAttribute("messaggioBenvenuto", messaggio);
        return "welcomePage";
    }

}
