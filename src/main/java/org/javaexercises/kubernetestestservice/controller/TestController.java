package org.javaexercises.kubernetestestservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/api/teste"))
public class TestController {

    @GetMapping("/ativo")
    public String test() {
        return "O serviço de teste do kubernetes está ativo!";
    }
}