package com.project.web.titanic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/passengers")
public class PassengerController {
    @Autowired PassengerService passengerService;
    @GetMapping("/csv")
    public void csvRead(){
        passengerService.readCsv();
    }
}
