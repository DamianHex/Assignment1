package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/testExceptionHandling")
@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }

    @GetMapping("/{code}")
    public String exception (@PathVariable("code") int code){
        String message = "";
        if(code == 401){
            message = "\"errorMessage\": \"You are not authorized\"";
        } else if (code == 404){
            message = "\"errorMessage\": \"resource not found\"";
        }
        return message;
    }
}
