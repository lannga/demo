package com.abc.demo.controler;

import java.util.List;

import com.abc.demo.model.Content;
import com.abc.demo.repository.ContentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

    @Autowired
    private ContentRepository cp;
    // private int i = 1;
    
    @GetMapping("mkt")
    public List<Content> send(){
        List<Content> li = cp.findAll();
        return li;        
    }

    
}