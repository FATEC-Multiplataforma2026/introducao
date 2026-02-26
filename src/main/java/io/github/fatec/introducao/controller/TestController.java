package io.github.fatec.introducao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "teste")
    public String teste() {
        return "TESTE";
    }

}
