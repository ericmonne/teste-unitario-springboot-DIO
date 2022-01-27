package com.dio.springboot.test.springboottest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String saudacao(String nome){
        return String.format("Bem-vindo, %s", nome);
    }
}
