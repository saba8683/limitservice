package com.app.limitservice.controller;

import com.app.limitservice.beans.Limits;
import com.app.limitservice.configurations.Configurations;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class LimitServiceController {
    @Autowired
    private Configurations configurations;
    @GetMapping("/limits")
    public ResponseEntity<Limits> retriveLimits(){
        return new ResponseEntity<Limits>(new Limits(configurations.getMinimum(),configurations.getMaximum()), HttpStatus.OK);
    }
    @GetMapping("/students")
    public String getMethodName() {
        return "ABCD";
    }
    
}
