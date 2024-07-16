package br.com.felipealves.taskmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstRota")
public class firstController {

    @GetMapping("/")
    public String firstMessage() {
        return "Funcionou";
    }
}
