package com.abc.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

    
    @GetMapping(name = "url")
    public void send(){
        
    }

    
}