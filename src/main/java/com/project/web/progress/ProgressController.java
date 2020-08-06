package com.project.web.progress;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgressController {

    @GetMapping("/")
    public String HelloWorld(){
        return "TDD SUCESS!!";
    }
}